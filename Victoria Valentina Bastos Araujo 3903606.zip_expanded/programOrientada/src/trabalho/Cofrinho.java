package trabalho;

import java.util.ArrayList;

public class Cofrinho {
	ArrayList<Moeda> listarMoedas = new ArrayList<Moeda>(); //LISTA DE MOEDAS
	
	public void adicionar(Moeda m) { //ADICIONAR
		listarMoedas.add(m);
	
	}
	
	public void remover(Moeda m) { //REMOVER
		listarMoedas.remove(m);
	
	}
	
	public void listas() { //LISTAR
		
		for (Moeda m: listarMoedas) {
			m.info();
		}		
	
	}
	
	public double totalConvertido() { //CONVERTER
		if(this.listarMoedas.isEmpty()) {
		return 0;
	
		}
		
		double Acumulado = 0;
		
		for (Moeda m: this.listarMoedas) {
			Acumulado = Acumulado + m.converter();
			}
	
		return Acumulado;
	
	}

}

