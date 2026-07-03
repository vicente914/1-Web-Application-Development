import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio9
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String abecedario = "abcdefghijklmnopqrstuvwxyz", frase;
		char[] letras = abecedario.toCharArray();
		int i, j,contador;
		int[] contadores = new int[26];

		//Resolucion del problema
		
		System.out.print("Introduce un texto: ");
		frase = sc.nextLine().toLowerCase();
		char[] caracteres = frase.toCharArray();

		for(i=0;i<caracteres.length;i++)
		{
			for(j=0;j<letras.length;j++)
			{
				if(caracteres[i] == letras[j])
				{
					contadores[j]+=1;
				}
			}
		}

		for(i=0;i<contadores.length;i++)
		{
			System.out.printf("%s: %d\n",letras[i],contadores[i]);
		}
	}
}