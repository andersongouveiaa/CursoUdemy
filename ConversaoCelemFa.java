package fundamentos;

import java.util.Scanner;

public class ConversaoCelemFa {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
			
		System.out.println("digite o valor em fahrenheit: ");
			double fah = scanner.nextDouble();
			
			double converter = fah * 1.8 + 32;
			
			System.out.print("valor convertido: " + converter);
			
			scanner.close();
			}

	
	}


