import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int NumeroFuncionario = sc.nextInt();
		int HorasTrabalhadas = sc.nextInt();
		double ValorHora = sc.nextDouble();
		
		double Salario = HorasTrabalhadas * ValorHora;
		
		System.out.println("NUMBER = " + NumeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", Salario);
		
		sc.close();
	
		

	}

}
