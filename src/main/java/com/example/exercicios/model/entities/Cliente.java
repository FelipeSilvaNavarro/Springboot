package com.example.exercicios.model.entities;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;

	public Cliente(int id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setI(int i) {
		this.id = i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
