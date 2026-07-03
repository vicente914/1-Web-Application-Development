import java.util.Scanner;
public class switch1
{
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		int num1,num2,opcion;
		
		
		//Resolución del problema
		System.out.print("Dime tu primer número: ");
		num1 = sc.nextInt();
		System.out.print("Dime tu segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println("********Menú de operaciónes********");
		System.out.println("\t1.- Sumar");
		System.out.println("\t2.- Restar");
    System.out.println("\t3.- Multiplicar");
    System.out.println("\t4.- Dividir");
    System.out.println("*********************************");
    System.out.print("Escoge una de las opciones insertando el número de la opción: ");
    opcion = sc.nextInt();
    
    switch(opcion)
    {
      case 1:
        System.out.println(num1+num2);
        break;
      case 2:
        System.out.println(num1-num2);
        break;
      case 3:
        System.out.println(num1*num2);
        break;
      case 4:
        System.out.printf("%.2f\n",(double)(num1/num2));
        break;
      default:
        System.out.println("Has introducido una opción que no existe");
    }
    
	}
}
