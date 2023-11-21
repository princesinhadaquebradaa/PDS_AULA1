package Modelo;

public enum Combustivel {	
	
		DISEL(1, "Oleo_Disel"), GASCOMUM(2, "Gas_Comum"), GASADITIVADA(3,"Gas_Aditivada"), ETANOL(4, "Etanol");
	
	private int codigo;
	private String descricao;

	private Combustivel(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.descricao;
	}
	
	
	

}
