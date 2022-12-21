import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Tempo = sc.nextInt(); 
		int Velocidade = sc.nextInt();
		
		int QuantidadeKM = Tempo * Velocidade;
		
		double LitrosGastos = QuantidadeKM / 12.0;
		
		System.out.printf("%.3f%n", LitrosGastos);
		
		sc.close();
	}

}
