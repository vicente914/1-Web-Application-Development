import java.util.Scanner;
public class Ejercicio6
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double nota1=99, nota2=99, nota3=99, media;
		
		//Resolución del problema
		try
		{
		  while((nota1 > 10|| nota1 < 0) || (nota2 > 10 || nota2 < 0) || (nota3 > 10 || nota3 < 0))
		  {
		    System.out.print("Introduce tu calificación ODyEC: ");
		    nota1 = Double.parseDouble(sc.nextLine());
		    System.out.print("Introduce tu calificación PR: ");
		    nota2 = Double.parseDouble(sc.nextLine());
		    System.out.print("Introduce tu calificación PE: ");
		    nota3 = Double.parseDouble(sc.nextLine());
		    
		    
		    if(nota3 < 5)
		    {
		      media = (nota1*0.10)+(nota2*0.30)+(nota3*0.60);
		      if(media > 5)
		      {
		        media = 4;
		        System.out.printf("Tu calificación del resultado de aprendizaje es %.0f porque no superas la PE.\n",media);
		      }
		      else
		      {
		        media = (nota1*0.10)+(nota2*0.30)+(nota3*0.60);
		        System.out.printf("Tu calificación del resultado de aprendizaje es %.0f porque no superas la PE.\n",media);
		      }
		    }
		    else
		    {
		      if(nota1 > 10 || nota2 > 10 || nota3 > 10)
		      {
		        System.out.println("No existe una nota por encima de 10, introduce una nota entre [0-10] ");
		      }
		      else
		      {
		        if(nota1 < 0 || nota2 < 0 || nota3 < 0)
		        {
		          System.out.println("No puedes introducir notas negativas, introduce una nota entre [0-10]: ");
		        }
		        else
		        {
		          media = (nota1*0.10)+(nota2*0.30)+(nota3*0.60);
		          System.out.printf("Tu calificación del resultado de aprendizaje es %.1f\n",media);		        
		        }
		      }
		    }
		  }
		}
		catch(NumberFormatException e1)
		{
		  System.out.println("ERROR: NO puedes introducir texto.");
		}
		catch(Exception e2)
		{
		  System.out.println("ERROR: El valor introducido es incorrecto.");
		}
		
		
		
	}
}
