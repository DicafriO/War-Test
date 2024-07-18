package Test_khlee0328.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class TestKhlee0328Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TestKhlee0328Application.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TestKhlee0328Application.class);
	}
}
