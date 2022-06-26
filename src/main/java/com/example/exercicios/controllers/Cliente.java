package com.example.exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class Cliente {

	@GetMapping(path = "/qualquer")
	public com.example.exercicios.model.entities.Cliente obterCliente() {
		return new com.example.exercicios.model.entities.Cliente(28, "Felipe", "094.393.274-21");
	}
	@GetMapping("/{id}")
	public com.example.exercicios.model.entities.Cliente obterClientePorId1(@PathVariable int id) {
		return new com.example.exercicios.model.entities.Cliente(id, "Rafael", "012.785.432-12");
	}
	@GetMapping()
	public com.example.exercicios.model.entities.Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new com.example.exercicios.model.entities.Cliente(id, "Ana", "425.12.419-85");
	}
}
