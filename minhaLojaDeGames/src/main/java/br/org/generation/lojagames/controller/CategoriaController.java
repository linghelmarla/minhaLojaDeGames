package br.org.generation.lojagames.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@GetMapping("/findAllCategoria")
	public String findAllCategoria() {
		return "findAllCategoria";
	}

	@GetMapping("/findByIDCategoria")
	public String findByIDCategoria() {
		return "findByIDCategoria";
	}

	@GetMapping("/findByDescricaoCategoria")
	public String findByDescricaoCategoria() {
		return "findByDescricaoCategoria";
	}

	@GetMapping("/postCategoria")
	public String postCategoria() {
		return "postCategoria";
	}

	@GetMapping("/putCategoria")
	public String putCategoria() {
		return "putCategoria";
	}

	@GetMapping("/deleteCategoria")
	public String deleteCategoria() {
		return "deleteCategoria";
	}

}