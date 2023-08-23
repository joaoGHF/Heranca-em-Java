package org.model;

public class Pessoa {
	// Atributos
	private String nome;
	private final long CPF;
	private int idade;
	private String endereco;

	// Constructor
	public Pessoa(String nome, long CPF, int idade, String endereco) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
		this.endereco = endereco;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCPF() {
		return CPF;
	}

	/*
	 * public void setCPF(long cPF) { CPF = cPF; }
	 */

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// Método printThis
	public void printThis() {
		System.out.println("Class=" + this.getClass() + ";");
		System.out.println("this.nome=" + nome + ";");
		System.out.println("this.CPF=" + CPF + ";");
		System.out.println("this.idade=" + idade + ";");
		System.out.println("this.endereco=" + endereco + ";");
	}
}
