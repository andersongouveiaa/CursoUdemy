package fundamentos;

import java.util.Scanner;

public class ConversaoFaemCel {

	public static void main(String[] args) {
		

	Scanner scanner = new Scanner(System.in);
		
	System.out.println("digite o valor em celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = ( celsius - 32 ) / 1.8;
		
		System.out.print("valor convertido: %2.f" + conversao);
		
		scanner.close();
		}

}
