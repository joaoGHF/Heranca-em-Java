package org.model;

public class Aluno extends Pessoa {
	// Atributos
	private long matricula;
	private int anoEntrada;
	private int anoFormatura;

	// Constructor
	public Aluno(String nome, long CPF, int idade, String endereco, long matricula, int anoEntrada, int anoFormatura) {
		super(nome, CPF, idade, endereco);
		this.matricula = matricula;
		this.anoEntrada = anoEntrada;
		this.anoFormatura = anoFormatura;
	}

	// Getters e Setters
	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public int getAnoFormatura() {
		return anoFormatura;
	}

	public void setAnoFormatura(int anoFormatura) {
		this.anoFormatura = anoFormatura;
	}

	// Override Método printThis
	@Override
	public void printThis() {
		super.printThis();
		System.out.println("this.matricula=" + matricula + ";");
		System.out.println("this.anoEntrada=" + anoEntrada + ";");
		System.out.println("this.anoFormatura=" + anoFormatura + ";");
	}
}
