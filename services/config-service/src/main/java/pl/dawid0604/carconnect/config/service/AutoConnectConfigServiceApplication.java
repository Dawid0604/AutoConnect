package pl.dawid0604.carconnect.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableCaching
@EnableConfigServer
@SpringBootApplication
class AutoConnectConfigServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(AutoConnectConfigServiceApplication.class, args);
	}

}
