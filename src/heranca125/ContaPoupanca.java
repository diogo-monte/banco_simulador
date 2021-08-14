package heranca125;

public class ContaPoupanca extends Conta {
	
	private Double juros;
	
	public ContaPoupanca() {
	}

	public ContaPoupanca(Integer numero, String dono, Double juros) {
		super(numero, dono);
		this.juros = juros;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}
	
	public void atualizarSaldo() {
		deposito(this.getSaldo() * juros);
	}
	
	@Override
	public void saque(Double valor) {
		this.saldo -= valor;
		
	}

}
