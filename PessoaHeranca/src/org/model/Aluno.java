package org.model;

/**
 * <p>
 * A classe {@code Aluno} extende a classe {@code Pessoa} para a sua
 * especialização em um tipo Aluno.
 * </p>
 * 
 * @see Pessoa
 */
public class Aluno extends Pessoa {
	// Atributos
	private long matricula;
	private int anoEntrada;
	private int anoFormatura;

	/**
	 * <p>
	 * Método construtor da classe {@code Aluno} com implementação do construtor
	 * {@code super()} para a progenitora {@code Pessoa}.
	 * </p>
	 * 
	 * @param nome         do tipo String, (Pessoa)
	 * @param CPF          do tipo long, (Pessoa)
	 * @param idade        do tipo int, (Pessoa)
	 * @param endereco     do tipo String, (Pessoa)
	 * @param matricula    do tipo long, (Aluno)
	 * @param anoEntrada   do tipo int, (Aluno)
	 * @param anoFormatura do tipo int, (Aluno)
	 */
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

	/**
	 * <p>
	 * Sobreescita do método {@code printThis()} de {@code Pessoa}. Chama o método
	 * {@code super.printThis()} e imprime
	 * juntamente os atributos declarados na classe {@code Aluno}.
	 * </p>
	 */
	@Override
	public void printThis() {
		super.printThis();
		System.out.println("this.matricula=" + matricula + ";");
		System.out.println("this.anoEntrada=" + anoEntrada + ";");
		System.out.println("this.anoFormatura=" + anoFormatura + ";");
	}
}
