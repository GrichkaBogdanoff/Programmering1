package HemläxaV36;

import java.util.Scanner;

public class HemläxaV36 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad är ditt namn?");
		
		String namn = input.nextLine() ;
		
		System.out.println(namn);
	}
}