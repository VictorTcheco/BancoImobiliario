package models.entities;

public class companhia extends Propriedade{

	private int taxaDados;
	
	public companhia(String nome, int hipoteca, int taxaDados) {
		super(nome, hipoteca);
		this.taxaDados = taxaDados;
		}

}
