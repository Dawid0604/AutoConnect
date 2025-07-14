package pl.dawid0604.autoconnect.discovery.service;

import lombok.NoArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static lombok.AccessLevel.PACKAGE;
import static org.assertj.core.api.Assertions.catchThrowable;

@SpringBootTest
@NoArgsConstructor(access = PACKAGE)
class AutoConnectDiscoveryServiceApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertThat(catchThrowable(() -> AutoConnectDiscoveryServiceApplication.main(new String[] { })))
				  .doesNotThrowAnyException();
	}
}
