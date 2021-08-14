package heranca125;

public class ContaEmpresa extends Conta {
	
	private Double limiteEmprestimo;
	public static final Double TAXA_EMPRESTIMO = 10.;
	public static final Double TAXA_SAQUE = 2.5;

	public ContaEmpresa() {
		
	}

	public ContaEmpresa(Integer numero, String dono, Double limiteEmprestimo) {
		super(numero, dono);
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(Double valor) {
		if(valor > this.limiteEmprestimo) {
			System.out.println("SEU LIMITE NAO PERMITE ESTE EMPRESTIMO");
		}
		else {
			System.out.println("EMPRESTIMO REALIZADO - (Sera cobrada uma taxa " + TAXA_EMPRESTIMO);
			deposito(valor - 5);
			
		}
	}
	
	@Override
	public void saque(Double valor) {
		this.saldo -= (valor + TAXA_SAQUE);
	}
	

}
