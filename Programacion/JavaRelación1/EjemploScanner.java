//Importamos el paquete directo de las librerias API con la clase Scanner
import java.util.Scanner;

public class EjemploScanner
{
  public static void main (String[] args)
  {
  
    int valor;
    //Creamos objeto de la clase Scanner
    Scanner tec = new Scanner(System.in);
    
    //Pedimos un valor entero
    System.out.print("Introduce un valor entero: ");
    
    //Cogemos el valor introducido por el usuario
    valor = tec.nextInt();
    
    //Vemos el valor por pantalla
    System.out.println("Se ha introducido el valor " + valor);
    
  }
}
