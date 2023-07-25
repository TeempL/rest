package br.com.erudio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	private static final String template = "Olá, %s! :)";
	private static  Long id = 1L;
	
	@GetMapping("/response")
	public Greeting greetingJSON(@RequestParam(name = "nome", defaultValue = "Mundo") String nome) {
		return new Greeting(id++, String.format(template, nome));
	}
	
	
	
	
	
}
