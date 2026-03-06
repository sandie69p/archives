#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Libro {
    char *titolo;
    char *autore;
    int pagine;
} Libro;

void aggiungiLibro(Libro *);
void rimuoviLibro(Libro *);
void mostraLibro(Libro *);

int main(void) {
	int count;
	int choise;

	printf("Quanti Libri vuoi aggiungere? ");
	scanf("%d", &count);

	Libro *p = (Libro *)malloc(count * sizeof(Libro));

	while(1) {
		printf("Inserisci un numero da 0 a 4:\n0: Esci dall'applicazione;\n1: Aggiungi Libro;\n2: Rimuovi Libro;\n3: Mostra Libri;\n ");
		scanf("%d", &choise);
		switch(choise) {
			case 0: { } break;
			case 1: { aggiungiLibro(p);  } break;
			case 2: { rimuoviLibro(p);  } break;
			case 3: { mostraLibro(p);  } break;
			default: continue;
		}
	}
}

void aggiungiLibro(Libro *p) {
	
}
