import java.util.Scanner;

public class Ejercicio13
{
	public static void main(String[] args)
	{
		//Variables y objetos
		
		Scanner sc = new Scanner(System.in);
		int i,j;
		String letras = "abcdefghijklmnopqrstuvwxyz";
		char[] letrasArray = letras.toCharArray();
		String frase;
		
		//Resolucion del problema
		System.out.print("Introduce un frase para cifrar: ");
		frase = sc.nextLine().toLowerCase();
		char[] caracteres = frase.toCharArray();
		char[] cifrado = new char[caracteres.length];

		for(i=0;i<caracteres.length;i++)
		{
			for(j=0;j<letrasArray.length;j++)
			{
				if(caracteres[i] == letrasArray[23])
				{
					cifrado[i] = letrasArray[0];
				}
				else if(caracteres[i] == letrasArray[24])
				{
					cifrado[i] = letrasArray[1];
				}
				else if(caracteres[i] == letrasArray[25])
				{
					cifrado[i] = letrasArray[2];
				}
				else if(caracteres[i] == letrasArray[j])
				{
					cifrado[i] = letrasArray[j+3];
				}
				else if(!Character.isLetter(caracteres[i]))
				{
					cifrado[i] = caracteres[i];
				}
				
			}
		}

		for(i=0;i<caracteres.length;i++)
		{
			System.out.print(cifrado[i]);
		}
		System.out.println();
	}
}

/*

*/