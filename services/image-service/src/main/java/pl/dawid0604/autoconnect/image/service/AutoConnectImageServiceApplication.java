package pl.dawid0604.autoconnect.image.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCaching
@EnableDiscoveryClient
@SpringBootApplication
class AutoConnectImageServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(AutoConnectImageServiceApplication.class, args);
	}

}
