package br.com.sabatinirafa;


import java.util.Scanner;


public class Aluno {

	private Integer nota1;
	
	private Integer nota2;
	
	private Integer nota3;
	
	private Integer nota4;
	
	private Integer media;
	
	
	
	public void receberNotas() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		this.nota1 = scanner.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		this.nota2 = scanner.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		this.nota3 = scanner.nextInt();
		
		System.out.print("Digite a quarta nota: ");
		this.nota4 = scanner.nextInt();
		
		scanner.close();
	}
	
	
	
	public void calcularMedia () {
		this.media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
	}
	
	
	
	public void exibirResultado () {
		System.out.println("Sua média final é: " + this.media);
		
		if (this.media >= 7) {
			System.out.print("Você passou!");
		} else if (this.media >= 5) {
			System.out.print("Você está de recuperação!");
		} else {
			System.out.print("Você foi reprovado!");
		}
	}
	
	
}
