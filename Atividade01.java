package modulo12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade01 {

	public static void main(String[] args) {
		
		int num;
		
		Set <Integer> setCodigo = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		for (int cont = 0; cont < 10; cont++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			setCodigo.add(num);
		}
		
		
		Iterator<Integer> isetCodigo = setCodigo.iterator();
		System.out.println("");
		System.out.println("Listar dados do Set: ");
		while(isetCodigo.hasNext()) {
			System.out.println(isetCodigo.next()); 
		}
	
		
			
	
		
		
	}

}
