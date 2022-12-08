import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
				
		int Cod1 = sc.nextInt();
		int QuantPec1 = sc.nextInt();
		double ValorPec1 = sc.nextDouble();
		double Tot1 = ValorPec1 * QuantPec1;
		
		int Cod2 = sc.nextInt();
		int QuantPec2 = sc.nextInt();
		double ValorPec2 = sc.nextDouble();
		double Tot2 = QuantPec2 * ValorPec2;
		
		double TOTAL = Tot1 + Tot2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);		
				
				
		sc.close();

	}

}
