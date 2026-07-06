import java.util.Scanner;
public class Ejercicio8
{
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		double base;
		int exponente;
		
		//Resolución del problema
		System.out.print("Introduce un número: ");
		base = sc.nextDouble();
		System.out.print("Introduce a cuanto quieres elevar introducido: ");
		exponente = sc.nextInt();
		sc.nextLine();
		
		double resultado = Math.pow(base, exponente);

		System.out.println(resultado);
	}
}
