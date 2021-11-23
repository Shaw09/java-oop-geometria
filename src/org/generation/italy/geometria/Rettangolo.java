package org.generation.italy.geometria;

public class Rettangolo {

	int base;
	int altezza;
	
	Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	int calcolaPerimetro() {
		return this.base * 2 + this.altezza * 2;
	}
	int calcolaArea() {
		return this.base * this.altezza;
	}
	
	
}
