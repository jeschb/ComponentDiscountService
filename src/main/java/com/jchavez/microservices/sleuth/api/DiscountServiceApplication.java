package com.jchavez.microservices.sleuth.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DiscountServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(DiscountServiceApplication.class);

	@GetMapping("/getDiscount")
	public String discount() {
		log.info("discount service called....");
		return "Se otorgó 15% de descuento al alumno";
	}

//	@GetMapping("/payment")
//	public String payment() {
//		log.info("payment service called with discount....");
//		return template.getForObject("http://localhost:8080/getDiscount", String.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(DiscountServiceApplication.class, args);
	}
}
