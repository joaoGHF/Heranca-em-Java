package org.model;

public class Funcionario extends Pessoa {
	// Atributos
	private double PIS;
	private String funcao;
	private double salario;

	// Constructor
	public Funcionario(String nome, long CPF, int idade, String endereco, double PIS, String funcao, double salario) {
		super(nome, CPF, idade, endereco);
		this.PIS = PIS;
		this.funcao = funcao;
		this.salario = salario;
	}

	// Getters e Setters
	public double getPIS() {
		return PIS;
	}

	public void setPIS(double pIS) {
		PIS = pIS;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Override Método printThis
	@Override
	public void printThis() {
		super.printThis();
		System.out.println("this.PIS=" + PIS + ";");
		System.out.println("this.funcao=" + funcao + ";");
		System.out.println("this.salario=" + salario + ";");
	}
}
