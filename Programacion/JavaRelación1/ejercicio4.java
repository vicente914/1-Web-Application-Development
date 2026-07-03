import java.util.Scanner;

public class ejercicio4
{
  public static void main (String[] args)
  {
    //Variables y objetos
    Scanner sc = new Scanner(System.in);
    double numero1, numero2, suma, resta, multiplicacion, division;
    
    //Resolución del problema
    System.out.print("Dime tu primer número: ");
    numero1 = sc.nextDouble();
    System.out.print("Dime tu segundo número: ");
    numero2 = sc.nextDouble();
    
    suma = numero1+numero2;
    resta = numero1-numero2;
    multiplicacion = numero1*numero2;
    division = numero1/numero2;
    
    System.out.printf("La suma de esos dos números da %.2f\nLa resta da %.2f\nLa multiplicación da %.2f\nY la division da %.2f\n",suma, resta, multiplicacion, division);
  }
}
