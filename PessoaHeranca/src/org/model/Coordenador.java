package org.model;

public class Coordenador extends Funcionario {
	// Atributos
	private String curso;

	// Constructor
	public Coordenador(String nome, long CPF, int idade, String endereco, double PIS, String funcao, double salario,
			String curso) {
		super(nome, CPF, idade, endereco, PIS, funcao, salario);
		this.curso = curso;
	}

	// Getter e Setter
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	// Override Método printThis
	@Override
	public void printThis() {
		super.printThis();
		System.out.println("this.curso=" + curso + ";");
	}}
