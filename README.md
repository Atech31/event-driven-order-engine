# Distributed Event-Driven Order Processing Engine

An enterprise-grade, event-driven microservices architecture built with **Java 17**, **Spring Boot**, **Apache Kafka**, **Redis**, and **PostgreSQL**. Designed for asynchronous, high-throughput order processing and real-time state transitions.

---

##  Architecture & Event Flow

1. **Order Creation:** Client sends a POST request to create an order. The API saves the order with a `PENDING` status to **PostgreSQL**.
2. **Event Publishing:** An `OrderCreatedEvent` payload is serialized and published to the **Apache Kafka** topic (`order.created.v1`).
3. **Asynchronous Consumption:** The `OrderConsumer` listens to the Kafka topic, processes the event asynchronously, simulates inventory reservation, and updates the order status to `INVENTORY_RESERVED`.
