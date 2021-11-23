package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int base;
		int altezza;
	
		System.out.print("Inserire qui la base del tuo rettangolo: ");
		base = scanner.nextInt();
		
		System.out.print("Inserire qui l`altezza del tuo rettangolo: ");
		altezza = scanner.nextInt();
		
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
	
		System.out.println("Il tuo perimetro è di: " + rettangolo.calcolaPerimetro());
		System.out.println("La tua area è di: " + rettangolo.calcolaArea());
		
		scanner.close();
	}
}
