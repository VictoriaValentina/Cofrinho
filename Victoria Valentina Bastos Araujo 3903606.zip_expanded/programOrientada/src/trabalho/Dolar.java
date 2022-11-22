package trabalho;

public class Dolar extends Moeda {
	

	@Override
	public void info() {
		System.out.println("Moeda: Dólar/ Valor: $" + this.mostrarValor());
		
	}
	
	@Override
	public double converter() { //CONVERSÃO DOLAR EM REAL
		double totalDolar = valor * 5.24;
		return totalDolar;
		
	}
	
	public Dolar(double valor) {
	super(valor);
	
	}
	
	double mostrarValor() {
		double total = valor;
		return total;
	
	}
	
}