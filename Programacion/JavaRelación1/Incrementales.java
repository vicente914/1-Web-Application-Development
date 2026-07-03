//Ejemplo de operadores Incrementales ++ --
public class Incrementales
{
	public static void main (String[] args)
	{
	  //Declaramos tres variables de tipo entero
	
	  int x=3,y,z;
	
	  y=++x;
	  
	  System.out.println("x="+x);
	  System.out.println("y="+y);
	  
	  z=x++;
	  System.out.println("x="+x);
	  System.out.println("y="+y);
	  
	  System.out.println("z="+z);
	}
}
