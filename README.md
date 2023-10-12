# KafkaFundamental Microservice

KafkaFundamental is a Spring-based microservice that serves as a fundamental introduction to Apache Kafka, a distributed streaming platform. This README provides an overview of the project structure, its components, and how to test Kafka using this microservice.

## Project Structure

The project is organized as follows:

- `java/com/apachekafka/fundamental`: This package contains the core classes and components of the KafkaFundamental microservice.

### Config

- `ConsumerConfiguration.java`: This class defines the configuration for the Kafka consumer, including topics, group IDs, and deserialization settings.

- `KafkaConfiguration.java`: This class sets up the Kafka producer configuration, including the producer factory and template.

- `ProducerConfiguration.java`: This class defines the configuration for the Kafka producer, specifying the broker details and producer properties.

### Components

- `Consumer.java`: This class represents a Kafka consumer that subscribes to Kafka topics and consumes messages from those topics.

- `Publisher.java`: This class is responsible for publishing (producing) messages to Kafka topics.

- `KafkaFundamentalApplication.java`: This is the main application class that initializes the Spring Boot application and runs the KafkaFundamental microservice.

## How to Use KafkaFundamental

To get started with KafkaFundamental and understand the basics of Kafka, follow these steps:

1. Clone this project:

   ```sh
   git clone https://github.com/your-github-account/KafkaFundamental.git
Open the project in your preferred Java IDE.
Configure Kafka settings in the ConsumerConfiguration.java and ProducerConfiguration.java classes to specify your Kafka broker details and topics.
Run the KafkaFundamental application using your IDE or Maven:
sh
Copy code
mvn spring-boot:run
Explore the Consumer.java and Publisher.java classes to understand how Kafka consumers and producers work.
Use the provided Kafka topics and messages to experiment with Kafka's publish-subscribe model.
Testing Kafka

This microservice allows you to experiment with Apache Kafka and gain a better understanding of its capabilities. You can use the provided Kafka topics and the consumer and publisher components to test Kafka features.
