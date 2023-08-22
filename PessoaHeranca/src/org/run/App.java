package org.run;

import org.model.*;

public class App {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Joaozinho", 120_156_875_9L, 10, "Rua Alfa, 256", 785_689L, 2022, 2025);
		Aluno aluno2 = new Aluno("Pedrinho", 754_965_468_28L, 12, "Rua Lambda, 1024", 559_816L, 2021, 2026);
		
		Funcionario funcionario = new Funcionario("Jorge", 925_546_123_4L, 30, "Rua Delta, 64", 200f, "Inspetor", 2200f);
		
		Coordenador coordenador = new Coordenador("Carlos", 445_612_685_7L, 29, "Rua Gama, 128", 250.5f, "Coordenador", 2329.41, "Curso LALL - 8");
		
		System.out.println("*** aluno1 ***");
		aluno1.printThis();
		
		System.out.println("\n\n*** aluno2 ***");
		aluno2.printThis();
		
		System.out.println("\n\n*** funcionario ***");
		funcionario.printThis();
		
		System.out.println("\n\n*** coordenador ***");
		coordenador.printThis();
	}
}
