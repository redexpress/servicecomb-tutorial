package io.github.redexpress.math;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class MathApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathApplication.class, args);
	}
}
