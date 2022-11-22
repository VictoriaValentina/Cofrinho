package trabalho;

public class Real extends Moeda {
	
	@Override
	public void info() { //MÉTODO INFO, IMPRIMIRÁ O VALOR E O TIPO DE MOEDA 
		System.out.println("Moeda: Real/ Valor: R$" + this.mostrarReal());	
	
	}
	
	@Override
	public double converter() { //PARA CONVERTER E SOMAR O VALOR
		return valor;
	
	}
	
	public Real(double valor) { //VALOR VINDO DA CLASSEMÃE
	super(valor);
	
	}
	
	double mostrarReal() { //UTILIZADO NO MÉTODO INFO
		double total = valor;
		return total;	
	
	}


}
