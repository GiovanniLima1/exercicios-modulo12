package modulo12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01DeEstruturaDeDados {

	public static void main(String[] args) {
		int resp, cond = 1;
		String nome;
		
		Queue<String> fila = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		do{
			
			System.out.println("Digite a opção desejada:  \n" + "1 - Adicionar um novo cliente na fila \n" + "2 - Listar todos os clientes na fila \n" + 
			"3 - Retirar cliente da fila \n" + "0 - Sair");
			resp = leia.nextInt();
			leia.nextLine();
			
			switch (resp){
			case 1:
				System.out.println("Digite o nome do cliente: ");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println(fila + "\nCliente  adicionado!");
				break;
			case 2:
				System.out.println("Clientes na fila: " + fila);
				break;
			case 3:
				if (fila.isEmpty() == true) {
					System.out.println("A fila está vazia");
				}else 
					fila.poll();
					System.out.println("Clientes na fila: " + fila);
					System.out.println("Cliente foi chamado!");
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
