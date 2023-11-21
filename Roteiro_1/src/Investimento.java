
public class Investimento {
		private int meses;
		private double juros;
		private double deposito_mesal;
		
		public Investimento(int a, double j, double dm) {
			meses = a; 
			juros = j/100;
			deposito_mesal = dm;
		}
		public double calcuolaTotal () {
			int num_pagamentos = meses;
			double total = 0;
			for (int i = 0; i < num_pagamentos; i++) {
				total = total + deposito_mesal;
				total = total + total * juros;
			}
			return total;
		}
}
