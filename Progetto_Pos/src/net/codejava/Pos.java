package net.codejava;

import java.util.Scanner;
import java.util.ArrayList;

public class Pos {
	// attributi
	private ArrayList<Prodotto> prodotti;
	private double totale;

	// costruttore
	public Pos() {
		prodotti = new ArrayList<>();
		// lo inizializzamo a 0 perche non abbiamo passato alcun parametro
		totale = 0;
	}

	// Prodotto classe
	// prodotto nome arrayList
	// prodotti Istanza
	public void aggiungiProdotto(Prodotto prodotto) {
		prodotti.add(prodotto);
		totale += prodotto.getPrezzo();
	}

	public double getTotale() {
		return totale;
	}

	public void paga(double importo) {
		if (importo >= totale) {
			double resto = importo - totale;
			System.out.println("Il pagamento e stato effettuato! Resto: " + resto);
			prodotti.clear();
			totale = 0;
		} else {
			System.out.println("Importo Insufficiente!");
		}
	}

	public static void main(String[] args) {
		// istanza di pos
		Pos pos = new Pos();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1) Aggiungi prodotto");
			System.out.println("2) Totale");
			System.out.println("3) Paga");
			System.out.println("4) Esci");

			int scelta = input.nextInt();

			switch (scelta) {
			case 1:
				System.out.println("Inserisci prodotto: ");
				String nome = input.nextLine();
				input.nextLine();

				System.out.print("Prezzo");
				double prezzo = input.nextDouble();

				Prodotto prodotto = new Prodotto(nome, prezzo);
				pos.aggiungiProdotto(prodotto);
				System.out.println("Prodotto aggiunto!");
				break;
			case 2:
				System.out.println("Totale: " + pos.getTotale());
				break;
			case 3:
				System.out.println("Importo: ");
				double importo = input.nextDouble();
				pos.paga(importo);
				break;
			case 4:
				return;
			default:
				System.out.println("Scelta non valida!");
				break;
			}
		}
	}

}
