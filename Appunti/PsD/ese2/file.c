#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Libro {
    char *titolo;
    char *autore;
    int pagine;
} Libro;

void aggiungiLibro(Libro *, int);
void rimuoviLibro(Libro *, int);
void mostraLibro(Libro *, int);

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
			case 0: { liberaChiudi(p, count); } break;
			case 1: { aggiungiLibro(p, count);  } break;
			case 2: { rimuoviLibro(p, count);  } break;
			case 3: { mostraLibro(p, count);  } break;
			default: continue;
		}
	}
}

void aggiungiLibro(Libro *p, int n) {
	int i = 0;
	char buffer[256];
	int len;

	while(i < n) {
		// Sezione titolo
		printf("Inserisci titolo: ");
		scanf("%[^\n]s", buffer);

		len = strlen(buffer);
		p[i].titolo = realloc(p[i].titolo, len * sizeof(char) + 1);
		strcpy(p[i].titolo, buffer);

		// Sezione autore
		printf("Inserisci autore: ");
		scanf("%[^\n]s", buffer);

		len = strlen(buffer);
		p[i].titolo = realloc(p[i].autore, len * sizeof(char) + 1);
		strcpy(p[i].autore, buffer);

		// sezione n pagine
		int pag;
		printf("Inserisci numero pagine del libro: ");
		scanf("%d", &pag);

		p[i].pagine = pag;
		
		i++;
	}
}

void rimuoviLibro(Libro *p, int n) {
	
}
