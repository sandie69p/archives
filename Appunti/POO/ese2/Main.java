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
	public static void main(String[] args) {
		
	}
}
