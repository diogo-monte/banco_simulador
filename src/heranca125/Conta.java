package heranca125;

public class Conta {
	
	private Integer numero;
	private String dono;
	private Double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String dono) {
		this.numero = numero;
		this.dono = dono;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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
		this.saldo -= valor;
		
	}
	
	public void deposito(Double valor) {
		this.saldo -= valor;
	}

	@Override
	public String toString() {
		return "Conta - Numero: " + getNumero() + ", Dono: " + getDono() + ", Saldo: " + getSaldo();
	}
	
	

	
}
