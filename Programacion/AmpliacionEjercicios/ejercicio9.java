import java.util.Scanner;
public class ejercicio9
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String edad;
		//Resolución del problema
		System.out.print("Tienes 18 o más años?: ");
		edad = sc.nextLine();
		System.out.printf("Si tu respuesta es SI, entonces eres mayor de edad\nSi tu respuesta es NO entonces no eres mayor de edad.\n");
	}
}

/*
int a;
String edad;

System.out.print("Introduce tu edad: ");
a = sc.nextInt();

edad = ( a => 18) ? "Mayor":"Menor";

System.out.print("Eres"+edad );
*/
