package cl.martini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.martini.model.dto.ResponseHelloWorld;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloWorld")
	public ResponseHelloWorld helloWorld() {
		ResponseHelloWorld response = ResponseHelloWorld.builder()
				.estadoOperacion(true)
				.message("Hello World!!")
				.statusCode(200)
				.build();
		return response;
	}

}
