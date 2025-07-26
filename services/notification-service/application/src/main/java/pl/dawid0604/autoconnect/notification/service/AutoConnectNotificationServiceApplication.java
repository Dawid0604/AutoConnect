package pl.dawid0604.autoconnect.notification.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application runtime class.
 */
@SpringBootApplication
final class AutoConnectNotificationServiceApplication {

    /**
     * Creating class instance is prohibited.
     */
    private AutoConnectNotificationServiceApplication() { }

    /**
     * Simple main method.
     * @param args arguments.
     */
    public static void main(final String[] args) {
        SpringApplication.run(AutoConnectNotificationServiceApplication.class, args);
    }
}
