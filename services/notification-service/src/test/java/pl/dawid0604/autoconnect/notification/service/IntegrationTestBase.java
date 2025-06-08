package pl.dawid0604.autoconnect.notification.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.kafka.KafkaContainer;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Import(IntegrationTestBase.TestContainersConfig.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IntegrationTestBase {

    @TestConfiguration
    static class TestContainersConfig {

        @Bean
        @ServiceConnection
        @SuppressWarnings("unused")
        KafkaContainer kafkaContainer() {
            return new KafkaContainer("apache/kafka:3.9.1");
        }

        @Bean
        @ServiceConnection
        @SuppressWarnings("unused")
        MongoDBContainer mongoDBContainer() {
            return new MongoDBContainer("mongo:8.0.9");
        }
    }
}
