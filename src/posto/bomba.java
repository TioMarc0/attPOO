package posto;

public class bomba {
	
	private String posto;
	private double quant;
	private double preco;
	private double  Lvendidos;
	public String getPosto() {
		return posto;
	}
	
	public bomba( double quant, double preco) {
		setQuant(quant);
		setPreco(preco);
		
	}
	
	public bomba() {
		
	}
	public String GetPosto() {
		return posto;
	}
	
	public void setPosto(String posto) {
		if(posto.length() > 0)
		this.posto = posto;
	}
	public double getQuant() {
		if (quant > 0);
		return quant;
	}
	public void setQuant(double quant) {
		this.quant = quant;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco > 0);
		this.preco = preco;
	}
	public double getLvendidos() {
		return Lvendidos;
	}
	public void setLvendidos(double lvendidos) {
		Lvendidos = lvendidos;
	}
	
	public double valorParaLitros (double valor) {
		if (valor <= getLvendidos() && valor > 0) {
			setLvendidos(getLvendidos() - valor);
			
		}
		return valor;
		
	}
	
	
	public boolean valorPorLitro(double litro) {
		if (litro <= getLvendidos() && litro > 0) {
			setLvendidos(getLvendidos() - litro);
			return true;
		}
		return false;
	}
	public boolean abatecerPorValor(double valor) {
		if (valor <= getLvendidos() && valor > 0) {
			setLvendidos(getLvendidos() - valor);
			return true;
		}
		return false;
	}
	
	public boolean abastecer(double litro) {
		if (litro <= getLvendidos() && litro > 0) {
			setLvendidos(getLvendidos() - litro);
			return true;
		}
		return false;
	}
	
	public double faturamento (double quant) {
		if (quant <= getLvendidos() && quant > 0) {
			setLvendidos(getLvendidos() - quant);
			}
		return quant;
	}
	
	@Override
	public String toString() {
		return "bomba [quant=" + quant + ", preco=" + preco + ", Lvendidos=" + Lvendidos + "]";
	}
	
	
}
