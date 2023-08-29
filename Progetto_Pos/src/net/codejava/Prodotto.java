package net.codejava;

public class Prodotto {
	// attributi
	private String nome;
	private double prezzo;

	// costruttore
	public Prodotto(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	// metodi
	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

}
