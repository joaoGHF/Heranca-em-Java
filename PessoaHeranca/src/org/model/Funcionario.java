package org.model;

/**
 * <p>
 * A classe {@code Funcionario} extende a classe {@code Pessoa} para a sua
 * especialização em um tipo Funcionario.
 * E é extendida pela classe {@code Coordenador}
 * </p>
 * 
 * @see Pessoa
 * @see Coordenador
 */
public class Funcionario extends Pessoa {
	// Atributos
	private double PIS;
	private String funcao;
	private double salario;

	/**
	 * <p>
	 * Método construtor da classe {@code Funcionario} com implementação do
	 * construtor {@code super()} para a progenitora {@code Pessoa}.
	 * </p>
	 * 
	 * @param nome     do tipo String, (Pessoa)
	 * @param CPF      do tipo long, (Pessoa)
	 * @param idade    do tipo int, (Pessoa)
	 * @param endereco do tipo String, (Pessoa)
	 * @param PIS      do tipo double, (Funcionario)
	 * @param funcao   do tipo String, (Funcionario)
	 * @param salario  do tipo double, (Funcionario)
	 */
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

	/**
	 * <p>
	 * Sobreescita do método {@code printThis()} de {@code Pessoa}. Chama o método
	 * {@code super.printThis()} e imprime
	 * juntamente os atributos declarados na classe {@code Funcionario}.
	 * </p>
	 */
	@Override
	public void printThis() {
		super.printThis();
		System.out.println("this.PIS=" + PIS + ";");
		System.out.println("this.funcao=" + funcao + ";");
		System.out.println("this.salario=" + salario + ";");
	}
}
