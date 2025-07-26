package pl.dawid0604.autoconnect.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Application runtime.
 */
@EnableCaching
@EnableDiscoveryClient
@SpringBootApplication
final class AutoConnectUserServiceApplication {

    /**
     * Creating class instance is prohibited.
     */
    private AutoConnectUserServiceApplication() { }

    /**
     * Simple main method.
     * @param args arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(AutoConnectUserServiceApplication.class, args);
    }
}
