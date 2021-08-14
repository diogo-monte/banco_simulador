package heranca125;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("### INICIANDO UMA NOVA CONTA ###");
//		System.out.println("-----------------------------------");
//		
//		System.out.println("Conta Corrente [0] - Conta Poupanca ou Conta PJ [1]");
//		int n = sc.nextInt();
//		while(n != 0 && n!= 1) {
//			System.out.println("Pessoa Fisica [0] ou Juridica [1]");
//			n = sc.nextInt();
//		}
		
//		FAZENDO TESTES:
		
		Conta c1 = new Conta(1234,"Diogo");
		System.out.println(c1);
		c1.deposito(1000.);
		System.out.println(c1);
		c1.saque(200.);
		System.out.println(c1);
		
		
		System.out.println("----------------------------------------------------------");
		
		Conta cp1 = new ContaPoupanca(4567, "Marina", 0.01);
		System.out.println(cp1);
		cp1.deposito(1000.);
		System.out.println(cp1);
		cp1.saque(200.);
		System.out.println(cp1);
		
		
		System.out.println("----------------------------------------------------------");
		
		Conta ce1 = new ContaEmpresa(7894, "Patricia", 5000.);
		System.out.println(ce1);
		ce1.deposito(1000.);
		System.out.println(ce1);
		ce1.saque(200.);
		System.out.println(ce1);
		
		
		
//		sc.close();

	}

}
