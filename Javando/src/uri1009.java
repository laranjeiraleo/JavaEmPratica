import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String Vendedor = sc.next();
		double SalarioFixo = sc.nextDouble();
		double VendasEfetuadas = sc.nextDouble();
		
		double TOTAL = (VendasEfetuadas * 0.15) + SalarioFixo;
		
		System.out.printf("TOTAL = %.2f%n", TOTAL);
		
				
		sc.close();
	}

}
