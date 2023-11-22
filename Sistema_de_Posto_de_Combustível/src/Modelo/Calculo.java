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
 //public double calculo_oleo_motor(double preco500ml, double preco1L, int quantidade500ml, int quantidade1L) {
//	    double total_oleo_motor1 = 0;
//	    double total_oleo_motor2 = 0;
//
//	    if (quantidade500ml > 0) {
//	        total_oleo_motor1 += quantidade500ml * preco500ml; 
//	    }
//
//	    if (quantidade1L > 0) {
//	        total_oleo_motor2 += quantidade1L * preco1L; 
//	    }
//
//	    double total_oleo_motor = total_oleo_motor1 + total_oleo_motor2;
//	    return total_oleo_motor;
//	}
 
 public double calculo_oleo_motor_500ml(double preco500ml, double quantidade500ml) {
 double total_oleo_motor_500ml = 0;
 if (quantidade500ml > 0) {
     total_oleo_motor_500ml += quantidade500ml * preco500ml; 
 }
 
 return total_oleo_motor_500ml;
 
 }
 
 public double calculo_oleo_motor_1l(double preco1L, double quantidade1L) {
	 double total_oleo_motor_1l = 0;
	 if (quantidade1L > 0) {
	        total_oleo_motor_1l += quantidade1L * preco1L; 
	    }
	 
	 return total_oleo_motor_1l;
 }
 
 public double calculo_total_oleo_motor(double total_oleo_motor_500ml, double total_oleo_motor_1l) {
	 double total_oleo_motor = 0;
	 total_oleo_motor = total_oleo_motor_500ml + total_oleo_motor_1l;
	 
	 return total_oleo_motor;
 }
 
 public double calculo_desconto(double total_pagar_disel, double total_oleo_motor ) {
	
	 double valor_desconto ;
	 
	 valor_desconto =  (total_oleo_motor + total_pagar_disel) *  0.10;
	 double valor_depois_desconto = (total_oleo_motor + total_pagar_disel) - valor_desconto;
		
	 return valor_depois_desconto;
	 
	 }
 
 public double calculo_prazo(double total_pagar_disel, double total_oleo_motor ) {
	 double valor_prazo;
	 
        valor_prazo = total_oleo_motor + total_pagar_disel;
        
	 return valor_prazo;

	 }
 
 public double calculo_atraso(double total_pagar_disel, double total_oleo_motor, double valor_prazo ) {
	 double	valor_atrasado;
	 
	 //(total_oleo_motor + total_pagar_disel) = valor_prazo
	 
	 valor_atrasado = valor_prazo + (valor_prazo * 0.10);
        
	 return valor_atrasado;

	 }

 }
