#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int somma(int, int);

int main() {
	int a = 10;
	int b = 20;

	int sum = somma(a, b);
	return 0;
}

int somma(int n, int m) {
	return n + m;
}
