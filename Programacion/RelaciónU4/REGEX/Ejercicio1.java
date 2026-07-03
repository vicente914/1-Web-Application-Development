import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio1
{
	public static void main(String[] args)
	{
		//variables y objetos declarados
		Scanner sc = new Scanner(System.in);
		String dni;
		String regex = "[0-9]{8}[A-Z]";
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra;
		int numero;
		
		//Resolución del problema
		//Pedimos el DNI por pantalla y guardamos la respuesta en la variable dni
		System.out.print("Introduce tu DNI: ");
		dni = sc.nextLine();

		//Convertimos en Int con parseInt, los numeros del dni con el substring
		// y los dividimos entre 23 y lo almacenamos en numero
		numero = (char)(Integer.parseInt(dni.substring(0,8))%23);
		//Le damos a la variable letra el valor de numero
		letra = letras.charAt(numero);
		
		//
		Pattern patron = Pattern.compile(regex);
		Matcher m = patron.matcher(dni);

		if(m.matches() && letra == (dni.charAt(8)))
		{
			System.out.println("DNI valido");
		}
		else
		{
			System.out.println("DNI invalido");
		}
		
	}
}
