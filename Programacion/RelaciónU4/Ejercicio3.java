import java.util.Scanner;
public class Ejercicio3
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String cad1,cad2,cad3;
		//Resolución del problema
		System.out.print("Dime tu primera cadena de caracteres: ");
		cad1 = sc.nextLine();
		System.out.print("Dime la segunda cadena: ");
		cad2 = sc.nextLine();

		cad3 = cad1.concat(cad2);

		System.out.println(cad3);
	}
}