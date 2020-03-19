package br.com.drummond.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.drummond.models.Calculo;

@RestController
@RequestMapping("/calculadora")
public class Calculadora {
	
	@GetMapping("/{valor1}/{valor2}")
	public ResponseEntity<Calculo> calcular(@PathVariable double valor1, @PathVariable double valor2, @RequestParam("action") String funcao){
		
		Calculo c = new Calculo(valor1, valor2, funcao);
		
		return ResponseEntity.ok(c);
	}
}
