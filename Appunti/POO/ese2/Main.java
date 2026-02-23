/*
	Requisiti tecnici:
		> Classe astratta Veicolo
			-> Attributi: targa (String), livelloEnergia (int, da 0 a 100)
			-> Un costruttore per inizalizzare questi campi
			-> un metodo astratto void rifornisci();
			-> Un metodo concreto mostraStrato() che stampa targa e livello energia
		> SottoClasse AutoElettrica
			-> implementa rifornisci() portando il livelloEnergia a 100 (stampa "Rifornimento carburante in corso... ")
		> Classe GestoreFlotta (Main):
			-> Crea un ArrayList<Veicolo>
			-> Aggiungi alla lista almeno una macchina elettrica e a benzina
			>  Ciclo for each per:
				-> rifornire il veicolo
				-> stampare lo stato aggiornato di ognuno.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {	
	public class Veicolo() {
		private String tag;
		private int energyLevel;
		private int fuelLevel;

		public VeicoloBenzina(tag, energyLevel) {
			this.tag = tag;
			this.fuelLevel = fuelLevel;
		}

		public VeicoloElettrico() {
			this.tag = tag;
			this.energyLevel = energyLevel;
		}

		void rifornisciBenzina(fuelLevel) {
			int fuelToRefuel = 100 - fuelLevel;
		}

		void rifornisciBatteria(energyLevel) {
			int energyToRefuel = 100 - energyFuel;
		}
	}

	public static void main(String[] args) {
		int i = 0;
		Veicolo mia_macchina = new VeicoloBenzina("AA 000 AA", 30);

		System.out.println("Inserisci un numero: ");
		System.out.println("Inserisci 1 per rifornire la macchina a benzina; ");
		System.out.println("inserisci 2 per rifornire la macchina elettrica; ");
		System.out.println("Premi q per uscire");

	
		
		switch(i) {
			case 1: { Veicolo.rifornisciBenzina();  }
		}
	}
}
