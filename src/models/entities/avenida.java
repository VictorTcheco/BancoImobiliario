package models.entities;

public class avenida extends Propriedade {

	String bairro;
	int level = 0;
	int[] alugueis = new int[5];
	int valor_casa;
	int valor_hotel;
	
	public avenida(String nome, int hipoteca, String bairro, int[] alugueis, int valor_casa, int valor_hotel) {
		super(nome, hipoteca);
		this.bairro = bairro;
		this.alugueis = alugueis;
		this.valor_casa = valor_casa;
		this.valor_hotel = valor_hotel;
	}

} 
