package heranca125;

public class ContaEmpresa extends Conta {
	
	private Double limiteEmprestimo;
	public static final Double TAXA = 10.;

	public ContaEmpresa() {
		
	}

	public ContaEmpresa(Integer numero, String dono, Double limiteEmprestimo) {
		super(numero, dono);
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(Double valor) {
		if(valor > this.limiteEmprestimo) {
			System.out.println("SEU LIMITE NAO PERMITE ESTE EMPRESTIMO");
		}
		else {
			System.out.println("EMPRESTIMO REALIZADO - (Sera cobrada uma taxa " + TAXA);
			deposito(valor);
			saque(TAXA);
			
		}
	}
	

}
