//Importamos el paquete directo de las librerias API con la clase Scanner
import java.util.Scanner;

public class Eco
{
  public static void main (String[] args)
  {
  
    //Creamos objeto de la clase Scanner
    Scanner tec = new Scanner(System.in);
    
    //Pedimos un valor cualquiera
    System.out.print("Introduce un valor cualquiera: ");
    
    //Con esto cogemos CUALQUIER valor que el usuario haya introducido
    String valor = tec.nextLine();
    
    //Vemos el valor por pantalla
    System.out.println("Se ha introducido el valor " + valor);
   
  }
}
