package Model;

public class Calculo_4 {
	
	public double calculoGasolina(double preco, double valor) {
		double litro = valor / preco;
		return litro;
	
	}
	
	public double calculoTotal(double preco, double litros) {
	    double total = preco * litros;
	    return total;
	}

}
