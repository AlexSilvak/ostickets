package com.osticket.ostickets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OsticketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsticketsApplication.class, args);
	}

}
