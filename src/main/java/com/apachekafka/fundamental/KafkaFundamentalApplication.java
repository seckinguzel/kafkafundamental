package com.apachekafka.fundamental;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaFundamentalApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaFundamentalApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner(Publisher p) {
		return args -> {
			p.sendMessage("Hello!");
		};
	}
}
