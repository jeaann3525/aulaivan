package br.com.petshopp;

import java.util.ArrayList;

import java.util.Scanner;


public class petshop {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		int opcao;
		
		do {
			
			System.out.println("\n===MENU===");
			System.out.println("1 - cadastrar cachorro");
			System.out.println("2 - cadastrar gato ");
			System.out.println("3 - exibir animais ");
			System.out.println("4 - sair ");
			System.out.println("escolha uma opção");
			
			switch(opcao) {
			case 1 :
			System.out.println("nome do cachorro:");
			String nomeCachorro = scanner.nextLine();
			System.out.println("idade do cachorro");
			int idadeCachorro = scanner.nextInt();
			scanner.nextLine();
			System.out.println("raca do cachorro");
			String raca = scanner.nextLine();
			animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
			System.out.println("Cachorro cadsastrado com sucesso");
			
			
			case 2 :
				System.out.println("nome do cachorro:");
				String nomeCachorro = scanner.nextLine();
				System.out.println("idade do cachorro");
				int idadeCachorro = scanner.nextInt();
				scanner.nextLine();
				System.out.println("raca do cachorro");
				String raca = scanner.nextLine();
				animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
				System.out.println("Cachorro cadsastrado com sucesso");
				
			
			
			
			
			
			}
			
		}
		
		
		

	}

}
