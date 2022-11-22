package trabalho;

public class Euro extends Moeda {
	
	
	@Override
	public void info() {
		System.out.println("Moeda: Euro/ Valor: €" + this.mostrarValor());	
	
	}
	
	@Override
	public double converter() { //CONVERSÃO EURO EM REAL
		double totalEuro = valor * 5.17; 
		return totalEuro;
	
	}
	
	public Euro(double valor) {
	super(valor);
	
	}
	
	double mostrarValor() {
		double total = valor;
		return total;
	
	}


}
