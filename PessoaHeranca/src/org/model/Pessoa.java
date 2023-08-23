package org.model;
/**
 * <p>A classe {@code Pessoa}, é a progenitora das classes {@code Aluno} e {@code Funcionario} e, ancestral da classe {@code Coordenador}.</p>
 * @see Aluno
 * @see Funcionario
 * @see Coordenador
 */
public class Pessoa {
	// Atributos
	private String nome;
	private final long CPF;
	private int idade;
	private String endereco;

	/**
	 * <p>O método Constructor da classe {@code Pessoa}.</p>
	 * @param nome do tipo String
	 * @param CPF do tipo long
	 * @param idade do tipo int
	 * @param endereco do tipo String
	 */
	public Pessoa(String nome, long CPF, int idade, String endereco) {
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

	
	/**
	 * <p>O método {@code printThis()} imprime todos os atributos da classe e o nome completo da classe instânciada.</p>
	 * @return void
	 */
	public void printThis() {
		System.out.println("Class=" + this.getClass() + ";");
		System.out.println("this.nome=" + nome + ";");
		System.out.println("this.CPF=" + CPF + ";");
		System.out.println("this.idade=" + idade + ";");
		System.out.println("this.endereco=" + endereco + ";");
	}
}
