package org.model;

/**
 * <p>A classe {@code Coorenador} extende a classe {@code Funcionario} para a sua especialização em um tipo Coordenador, é descendente
 * da classe {@code Pessoa}.</p>
 * @see Funcionario
 * @see Pessoa
 */
public class Coordenador extends Funcionario {
	// Atributos
	private String curso;

	/**
	 * <p>Método construtor da classe {@code Coordenador} com implementação do construtor {@code super()} para a progenitora
	 * {@code Funcionario} e portanto, também para a ancestral {@code Pessoa}.</p>
	 * @param nome do tipo String, (Pessoa)
	 * @param CPF do tipo long, (Pessoa)
	 * @param idade do tipo int, (Pessoa)
	 * @param endereco do tipo String, (Pessoa)
	 * @param PIS do tipo double, (Funcionario)
	 * @param funcao do tipo String, (Funcionario)
	 * @param salario do tipo double, (Funcionario)
	 * @param curso do tipo String, (Coordenador)
	 */
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
	
	/**
	 * <p>Sobreescita do  método {@code printThis()} de {@code Funcionario}. Chama o método {@code super.printThis()} e imprime
	 * juntamente os atributos declarados na classe {@code Coordenador}.</p>
	 */	@Override
	public void printThis() {
		super.printThis();
		System.out.println("this.curso=" + curso + ";");
	}
}
