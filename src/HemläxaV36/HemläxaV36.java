package Heml�xaV36;

import java.util.Scanner;

public class Heml�xaV36 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad �r ditt namn?");
		String namn = input.nextLine() ;
		
		System.out.println("Hur gammal �r du");
		String �lder = input.nextLine();
		
		System.out.println("Vad �r din adress");
		String adress = input.nextLine();
		
		System.out.println("Vad �r din postnummer");
		String postnummer = input.nextLine();
		
		System.out.println("Vart bor du?");
		String stad = input.nextLine();
		
		System.out.println("Vad �r ditt telefonnummer?");
		String telefonnummer = input.nextLine();
		
		System.out.println(namn);
		System.out.println(�lder);
		System.out.println(adress);
		System.out.println(postnummer);
		System.out.println(stad);
		System.out.println(telefonnummer);
		
		System.out.println("Information");
		System.out.println(namn + " " + �lder + " " + adress + " " + postnummer + " "+ stad + " "+ telefonnummer);
	}
}
