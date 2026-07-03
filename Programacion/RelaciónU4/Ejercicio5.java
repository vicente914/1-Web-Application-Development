import java.util.Scanner;
public class Ejercicio5
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String cad1, cad2;

		//Resolución del problema
		System.out.print("Escribe una cadena: ");
		cad1 = sc.nextLine();
		System.out.print("Escribe lo que quieres encontrar: ");
		cad2 = sc.nextLine();

		System.out.println(cad1.contains(cad2));

	}
}