package com.example.rnumeralWeb;

import edu.xavier.csci.k98berry.Library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class RnumeralWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RnumeralWebApplication.class, args);
	}

	@PostMapping(path = "/decode", method = getdecodevalues.POST)

	public int ResponseMultiDecode(@PathVariable( String a , String b, String c]))
	{

	}

	@PostMapping(path = "/encode", method = getencodevalues.POST)
	public String ResponseMultiEncode(@PathVariable (int a, int b, int c))
	{

	}

	@GetMapping("/decode/{id}")

	public ResponseSingleDecode encode(@PathVariable("id") String L) {
		ResponseSingleDecode response = new ResponseSingleDecode();

		response.setNumber(Library.decode(L));

		return response;
	}

	@GetMapping("/encode/{id}")
	public ResponseSingleEncode decode(@PathVariable("id") int num) {
		ResponseSingleEncode response = new ResponseSingleEncode();

		response.setLetter(Library.encode(num));

		return response;
	}


}
