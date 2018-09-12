package HemläxaV36;

import java.util.Scanner;

public class HemläxaV36 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad är ditt namn?");
		String namn = input.nextLine() ;
		
		System.out.println("Hur gammal är du");
		String ålder = input.nextLine();
		
		System.out.println("Vad är din adress");
		String adress = input.nextLine();
		
		System.out.println("Vad är din postnummer");
		String postnummer = input.nextLine();
		
		System.out.println("Vart bor du?");
		String stad = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer?");
		String telefonnummer = input.nextLine();
		
	}
}