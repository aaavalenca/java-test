package teste;
import java.util.Scanner;
import entidades.Triangulo;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangulo x = new Triangulo();
		
		System.out.println("Insira medidas de x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print(x.area());
		
		sc.close();
		
	}

}

