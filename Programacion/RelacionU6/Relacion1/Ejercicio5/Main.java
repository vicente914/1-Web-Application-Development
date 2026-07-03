import objetos.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //variable
        Scanner sc = new Scanner(System.in);
        String marca;
        boolean encontrado = false;
        int i;

        //Creamos coches
        Coche coche1 = new Coche("Seal","Ibiza",2000);
        Coche coche2 = new Coche("Citroen","C4",2006);
        Coche coche3 = new Coche("Ebro","S700",2025);

        Coche[] coches = {coche1, coche2, coche3};

        //Pedimos marca
        System.out.print("Marca a buscar: ");
        marca = sc.nextLine();

        //Buscamos en el array si tenemos algún coche con esa marca
        
        for(i = 0; i < coches.length && !encontrado;i++)
        {
            if(marca.equalsIgnoreCase(coches[i].getMarca()))
            {
                encontrado = true;
            }
        }

        if(encontrado){
            System.out.printf("Encontrado en la posicion %d\n",i-1);
            System.out.println(coches[i-1]);
        }
        else
        {
            System.out.printf("No encontrado\n");
        }
    }
}