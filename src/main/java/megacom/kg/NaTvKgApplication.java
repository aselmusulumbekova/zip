package megacom.kg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
@EnableFeignClients(basePackages = "megacom.kg.microservices")
class NaTvKgApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaTvKgApplication.class, args);
	}

}
