import java.util.Scanner;
public class ejercicio8
{
  public static void main(String[] args)
 {
  //variables y objetos
  Scanner sc = new Scanner(System.in);
  int sueldoBase, comision1, comision2, comision3;
  final double COMISION = 0.1;
  double totalComision, sueldoFinal;
  
  //Resolución del problema
  System.out.print("Dime tu sueldo base: ");
  sueldoBase = sc.nextInt();
  System.out.print("Dime cuanto cobraste en tu primera comision: ");
  comision1 = sc.nextInt();
  System.out.print("Dime cuanto cobraste en tu segunda comision: ");
  comision2 = sc.nextInt();
  System.out.print("Dime cuanto cobraste en tu tercera comision: ");
  comision3 = sc.nextInt();
  
  totalComision = (comision1+comision2+comision3)*0.1;
  sueldoFinal = sueldoBase + totalComision;
  
  System.out.printf("Tu sueldo base es de %d\nTus comisiones en total son %.2f\nTu sueldo final es %.2f\n",sueldoBase, totalComision, sueldoFinal);
 }
}
