package modulo12;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Atividade02DeEstruturaDeDados {

	public static void main(String[] args) {
		int resp, cond = 1;
		String nome;
		
		Stack<String> pilha = new Stack<String>(); 
		
		Scanner leia = new Scanner(System.in);
		
		do{
	
			System.out.println("Digite a opção desejada:  \n" + "1 - Adicionar livro na pilha \n" + "2 - Listar todos os livros na pilha \n" + 
			"3 - Retirar um livro da pilha \n" + "0 - Sair");
			resp = leia.nextInt();
			leia.nextLine();
			
			switch (resp){
			case 1:
				System.out.println("Digite o nome do livro: ");
				nome = leia.nextLine();
				pilha.add(nome);
				System.out.println("Pilha: \n");
				for (String lista: pilha) {
					System.out.println(lista);
				}
				System.out.println("Livro  adicionado! \n");
				break;
			case 2:
				for (String lista: pilha) {
					System.out.println("Lista de livros adicionado: " + lista);
				} 
				break;
			case 3:
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha está vazia");
				}else 
					pilha.pop();
					System.out.println("Livros na pilha: ");
					for (String lista: pilha) {
						System.out.println(lista);
					}
					System.out.println("Um livro foi retirado da pilha!");
				break;
			case 0:
				cond = resp; 
				break;
			default:
				System.out.println("Opção inválida");
			}
		
		}while(!(cond == 0));
		System.out.println("Programa finalizado");
		
	}
}
