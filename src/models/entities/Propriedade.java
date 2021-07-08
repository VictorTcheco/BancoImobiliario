package models.entities;

public abstract class Propriedade {

	private String nome;
	private int hipoteca;
	private Jogador proprietario;
	
	public Propriedade(String nome, int hipoteca) {
		this.nome = nome;
		this.hipoteca = hipoteca;
	}

	public String toString() {
		return nome + ((proprietario != null) ? proprietario.getNome() : "Sem proprietario");
	}
	
}
