package heranca125;

public class Conta {
	
	public static final Double TAXA_SAQUE = 5.;
	
	private Integer numero;
	private String dono;
	protected Double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String dono) {
		this.numero = numero;
		this.dono = dono;
		this.saldo= 0.0;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(Double valor) {
		if (valor + TAXA_SAQUE > this.saldo) {
			System.out.println("VOCE NAO TEM SALDO SUFICIENTE PARA ESTE SAQUE");
		}
		else {
		this.saldo -= valor + TAXA_SAQUE;
		
	}
	}
	public void deposito(Double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta - Numero: " + getNumero() + ", Dono: " + getDono() + ", Saldo: " + getSaldo();
	}
	
	

	
}
