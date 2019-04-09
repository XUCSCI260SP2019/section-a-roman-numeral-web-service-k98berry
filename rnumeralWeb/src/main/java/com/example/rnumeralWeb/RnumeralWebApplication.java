package com.example.rnumeralWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class RnumeralWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RnumeralWebApplication.class, args);
	}

	@GetMapping("/decode/{id}")

	public ResponseSingleDecode encode(@PathVariable("id") String num) {
		ResponseSingleDecode response = new ResponseSingleDecode();

		response.setLetter(num);

		return response;
	}
}
