import java.util.Scanner;
public class Ejercicio4
{
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		String cad1, cad2, aux;

		//Resolución del problema
		System.out.print("Dime la primera cadena: ");
		cad1 = sc.nextLine();
		System.out.print("Dime la segunda cadena: ");
		cad2 = sc.nextLine();

		aux = cad1;
		cad1 = cad2;
		cad2 = aux;
		System.out.println("Cadena 1: "+cad1);
		System.out.println("Cadena2: "+cad2);

	}
}