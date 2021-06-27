# spring-boot-app-monitoring
Monitor the health of the spring boot application using prometheus and grafana

Monitoring Spring Boot Application With Micrometer, Prometheus And Grafana Using Custom Metrics

It is important to monitor an application health metrics this helps us to improve performance, manage the app, and notice unoptimized behavior. Monitoring each service is important to be able to maintain a system that consists of many microservices.

In this code I have demonstrated how Spring Boot app can be monitored using Micrometer which exposes metrics from our application, Prometheus which stores the metric data, and Grafana to visualize the data in graphs.

Implementing these tools can be done quite easily by adding just a few configurations. Additional to the default JVM metrics I will show how you can expose custom metrics like a user counter.

In the spring boot application, I have added the sctuator dependency for health-check. If we start our application we can see that the endpoints like health and info are already exposed to the /actuator endpoint per default.

Invoking the /actuator/health endpoint gives us a metric if the service is up and running.

Spring Boot Actuator can be integrated into Spring Boot Admin which provides a visual admin interface for your application. But this approach is not very popular and has some limitations. Therefore, we use Prometheus instead of Spring Boot Actuator and Grafana instead of Spring Boot Admin to have a more popular and framework/language-independent solution.

This solution approach needs vendor-neutral metrics and Micrometer is a popular tool for this use case.

I have used below:

1. Micrometer provides a simple facade over the instrumentation clients for the most popular monitoring systems, allowing you to instrument your JVM-based application code without vendor lock-in. Think SLF4J, but for metrics.
2. Prometheus stores our metric data in time series in memory by periodically pulling it via HTTP. The data can be visualized by a console template language, a built-in expression browser, or by integrating Grafana (which we will do after setting up Prometheus).
3. Grafana can pull data from various data sources like Prometheus, Elasticsearch, InfluxDB, etc. It also allows you to set rule-based alerts, which then can notify you over Slack, Email, Hipchat, and similar.

Note: I have used the Micrometer dependency in my boot projects and have used the Prometheus and Grafana docker images.
