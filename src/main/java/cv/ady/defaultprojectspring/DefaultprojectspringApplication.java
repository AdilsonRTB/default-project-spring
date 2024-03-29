package cv.ady.defaultprojectspring;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@OpenAPIDefinition
public class DefaultprojectspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefaultprojectspringApplication.class, args);
	}

}
