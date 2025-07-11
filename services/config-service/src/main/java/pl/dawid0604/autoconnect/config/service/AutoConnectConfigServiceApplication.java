package pl.dawid0604.autoconnect.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Application runtime.
 */
@EnableCaching
@EnableConfigServer
@SpringBootApplication
final class AutoConnectConfigServiceApplication {

	/**
	 * Creating class instance is prohibited.
	 */
	private AutoConnectConfigServiceApplication() { }

	/**
	 * Simple main method.
	 * @param args arguments
	 */
	public static void main(final String[] args) {
		SpringApplication.run(AutoConnectConfigServiceApplication.class, args);
	}

}
