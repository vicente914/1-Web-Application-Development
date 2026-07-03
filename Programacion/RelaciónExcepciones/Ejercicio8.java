 import java.util.Scanner;
public class Ejercicio8
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num1, num2, mcm;
		
		//Resolución del problema
		System.out.print("Dime un número: ");+
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Dime otro número: ");
		num2 = Integer.parseInt(sc.nextLine());
		
		try
		{	if(num1 < 0 || num2 < 0)
			{
				System.out.println("LOS NÚMEROS DEBEN SER POSITIVOS");
			}
			else
			{
				for(mcm=1;(mcm % num1) != 0 || (mcm % num2) != 0;mcm+=1)
				{	
				}
				System.out.printf("El mcm de (%d, %d) es %d\n",num1,num2,mcm);

			}
		}
		catch(Exception e1)
		{
			System.out.println("ERROR: Valor introducido incorrecto.");
		}	
	}
}

/*Para sacar el mcm de dos o varios números, deberemos hacer dicha operacion:
mcm(22,33)
Podemos decir dentro de un bucle "for" que el mcm = 1 o decir que mcm = 33(en este caso)
y decir despues que si mcm % 22 != 0 que siga incrementando mcm.

mcm % 22 != 0 || mcm % 33 != 0

*/