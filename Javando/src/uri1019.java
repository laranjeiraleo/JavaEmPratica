import java.util.Scanner;

public class uri1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int TotalSegundos = sc.nextInt();
		
		int QuantidadeHoras = TotalSegundos / 3600;
		TotalSegundos = TotalSegundos % 3600;
		
		
		int QuantidadeMinutos = TotalSegundos / 60; 
		TotalSegundos = TotalSegundos % 60;
		
		int QuantidadeSegundos = TotalSegundos;
		
		System.out.println(QuantidadeHoras + ":" + QuantidadeMinutos + ":" + QuantidadeSegundos);
		
		sc.close();

	}

}
