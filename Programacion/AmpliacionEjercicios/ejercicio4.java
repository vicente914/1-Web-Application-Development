import java.util.Scanner;
public class ejercicio4
{
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		String nombre;
		int telefono;
		double estatura;
		char gen;
		
		//Resolución del problema
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Dime tu número de telefono: ");
		telefono = sc.nextInt();
		System.out.print("Dime tu estatura: ");
		estatura = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Tu genero es M/F: ");
		 gen = sc.nextLine().charAt(0);
		
		System.out.printf("Hola, tu nombre es %s\nTu número de telefono es %d\nTu estatura es %.2f\nTu genero es %c\n ",nombre,telefono,estatura,gen);
		
	}
}
