package Model;

public class Calculo_5 {
	
	Double taxaFixaPorQuilo = 9.95;
	
	public double valor_total(double peso, double valor ) {
		 Double valor_total = peso * (valor + taxaFixaPorQuilo);
		return valor_total;
	
	}
	

}
