import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		double Pi = 3.14159;
		
		double VOLUME = (4/3.0) * Pi * Math.pow(R, 3);
		
		System.out.printf("VOLUME = %.3f%n", VOLUME);
				
		
		
		sc.close();
	}

}
