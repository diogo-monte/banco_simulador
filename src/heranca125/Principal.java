package heranca125;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("### INICIANDO UMA NOVA CONTA ###");
		System.out.println("-----------------------------------");
		
		System.out.println("Pessoa Fisica [0] ou Juridica [1]");
		int n = sc.nextInt();
		while(n != 0 && n!= 1) {
			System.out.println("Pessoa Fisica [0] ou Juridica [1]");
			n = sc.nextInt();
		}
		
		
		

		sc.close();

	}

}
