 package Modelo;

 public class Calculo {
	
 public double calculo_combustivel(double precoDisel, double precoComum, double precoAditivada, double precoEtanol, double qtdLitros, Combustivel tipo) {
		
		double total = 0;
		if (tipo == Combustivel.DISEL) 
		{
			total = qtdLitros * precoDisel;
			
		} else if(tipo == Combustivel.ETANOL) {
			total = qtdLitros * precoEtanol;
		}
		  
		else if (tipo == Combustivel.GASCOMUM) {
			total = qtdLitros * precoComum;
			
		}
		
		else if (tipo == Combustivel.GASADITIVADA) {
			total = qtdLitros * precoAditivada;
		}
		
		return total;
	}
 public double calculo_oleo_motor(double preco500ml, double preco1L, int quantidade500ml, int quantidade1L) {
	    double total_oleo_motor1 = 0;
	    double total_oleo_motor2 = 0;

	    if (quantidade500ml > 0) {
	        total_oleo_motor1 += quantidade500ml * preco500ml; // Adiciona ao total
	    }

	    if (quantidade1L > 0) {
	        total_oleo_motor2 += quantidade1L * preco1L; // Adiciona ao total
	    }

	    double total_oleo_motor = total_oleo_motor1 + total_oleo_motor2;
	    return total_oleo_motor;
	}
 }
