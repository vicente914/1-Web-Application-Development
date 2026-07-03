import java.util.Scanner;
public class ejercicio9
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3,orden;
		
		//Resolución del problema
		System.out.print("Dime un número: ");
		num1 = sc.nextInt();
		System.out.print("Dime un segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Dime un tercer número: ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num2 > num3)
		{
		  System.out.println(num1 +" > "+ num2 +" > "+ num3);
		}
		else
		{
		  if(num1 > num3 && num3 > num2)
		  {
		    System.out.println(num1 +" > "+ num3 +" > "+ num2);
		  }
		  else
		  {
		    if(num2 > num1 && num1 > num3)
		    {
		      System.out.println(num2 +" > "+ num1 +" > "+ num3);
		    }
		    else
		    {
		      if(num2 > num3 && num3 > num1)
		      {
		        System.out.println(num2 +" > "+ num3 +" > "+ num1);
		      }
		      else
		      {
		        if(num3 > num1 && num1 > num2)
		        {
		          System.out.println(num3 +" > "+ num1 +" > "+ num2);
		        }
		        else
		        {
		          System.out.println(num3 +" > "+ num2 +" > "+ num1);
		        }
		      }
		    }
		  }
		}
	}
}
