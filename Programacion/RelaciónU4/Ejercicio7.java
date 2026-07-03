import java.util.Scanner;
public class Ejercicio7
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String cad1;
		int i, voc=0,con=0,alfa=0;

		//Resolución del problema
		System.out.print("Escribe aquí: ");
		cad1 = sc.nextLine();

		for(i=0;i < cad1.length();i++)
		{
			if(cad1.charAt(i) == 'a' || cad1.charAt(i)=='A' || cad1.charAt(i)=='e' || cad1.charAt(i)=='E' || cad1.charAt(i)=='i' || cad1.charAt(i)=='I' || cad1.charAt(i)=='o' || cad1.charAt(i)=='O' || cad1.charAt(i)=='u' || cad1.charAt(i)=='U')
			{
				voc++;
			}
			else if(Character.isLetter(cad1.charAt(i)) == true)
			{
				con++;
			}
			if(Character.isLetterOrDigit(cad1.charAt(i)) == true )
			{
				alfa++;
			}

		}

		System.out.println("Vocales: "+voc);
		System.out.println("Consonantes: "+con);
		System.out.println("Alfanúmericos: "+alfa);
	}
}