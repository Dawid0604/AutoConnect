package pl.dawid0604.autoconnect.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableCaching
@EnableEurekaServer
@SpringBootApplication
class AutoConnectDiscoveryServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(AutoConnectDiscoveryServiceApplication.class, args);
	}

}
