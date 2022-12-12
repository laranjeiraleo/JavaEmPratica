import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double Pi = 3.14159;
		
		double TrianguloRetangulo = (A * C) / 2.0;
		double Circulo = Pi * Math.pow(C, 2);
		double Trapezio = (A+B) * C / 2.0;
		double Quadrado = B * B;
		double Retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", TrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", Circulo);
		System.out.printf("TRAPEZIO: %.3f%n", Trapezio);
		System.out.printf("QUADRADO: %.3f%n", Quadrado);
		System.out.printf("RETANGULO: %.3f%n", Retangulo);
		
		
		
		
		sc.close();
		
		


	}

}
