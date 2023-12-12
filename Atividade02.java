package modulo12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		
		String cor;
		
		ArrayList <String> coresList = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Digite uma cor: ");
			cor = leia.nextLine();
			coresList.add(cor);
		}
		System.out.println("\nListar todas as cores: " + coresList);
		
		Collections.sort(coresList);  
		
		System.out.println("\nOrdenar as cores: " + coresList);
		
		

	}

}
