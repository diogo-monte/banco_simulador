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
			System.out.println("EMPRESTIMO REALIZADO - (Sera cobrada uma taxa de $ " + TAXA_EMPRESTIMO + ")");
			System.out.println("OBS.: Sera creditado em sua conta $ " + valor);
			deposito(valor - TAXA_EMPRESTIMO);
			
		}
	}
	
	@Override
	public void saque(Double valor) {
		super.saque(valor + TAXA_SAQUE);
	}
	
	@Override
	public String toString() {
		return "Conta Empresa - Numero: " + getNumero() + ", Dono: " + getDono() + ", Saldo: " + getSaldo();
	}
	

}
