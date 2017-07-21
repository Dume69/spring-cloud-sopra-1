package com.sopra.boot.atelier1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@EnableDiscoveryClient
@SpringBootApplication
public class Atelier1Application {

	public static void main(String[] args) {
		DiscoveryClient dicoveryClient = SpringApplication.run(Atelier1Application.class, args)
				.getBean(DiscoveryClient.class);

		dicoveryClient.getServices().stream().forEach(service -> System.out.print(service));
	}

	@Component
	public class MyBean {
		private JdbcTemplate jdbcTemplate;

		public MyBean(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

		public JdbcTemplate getTemplate() {
			return jdbcTemplate;
		}
	}
}
