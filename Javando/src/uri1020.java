import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int IdadeDias = sc.nextInt();
		
		int Anos = IdadeDias / 365;
		IdadeDias = IdadeDias % 365;
		
		int Meses = IdadeDias / 30;
		IdadeDias = IdadeDias % 30; 
		
		int Dias = IdadeDias;
		
		System.out.println(Anos + " ano(s)");
		System.out.println(Meses + " mes(es)");
		System.out.println(Dias + " dia(s)");
		
			
		
		sc.close();

	}

}
