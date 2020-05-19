package cta.accenture.com.graph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GraphAnalyticApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphAnalyticApplication.class, args);
	}

}
