package com.example.rest_service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// El controller es el que me implementa el Greeting en el proyecto

@RestController // Esta anotación es la que me permite que el método procese la informacion como un controlador REST
public class GreetingController {

	private static final String template = "Hello, %s!"; // %s es un placeholder para el nombre
	private final AtomicLong counter = new AtomicLong(); // AtomicLong es un tipo de dato que me permite incrementar el contador de manera automatica

	@GetMapping("/greeting") // Esta anotacion le informa a la funcion que es un get, le habilita la ruta al localhost y llama a la funcion
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) { // Si esta funcion no fuera publica, no podria ser llamada desde el navegador
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}

// RequestParam: Es una anotacion que me permite recibir parametros de la URL, en este caso el nombre