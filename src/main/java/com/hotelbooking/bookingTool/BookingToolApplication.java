package com.hotelbooking.bookingTool;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration;


import java.util.Arrays;

@SpringBootApplication(exclude = MongoReactiveDataAutoConfiguration.class)
public class BookingToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingToolApplication.class, args);
	}

}
