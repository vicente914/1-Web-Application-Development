import java.util.Scanner;
public class Ejercicio2
{
    public static void main(String[] args)
    {
        //Declaracion de variables y objetos
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[4][4];
        int sum = 0;
    

        //Resolución del problema
        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num[i].length; j++)
            {
                num[i][j] = (int)(Math.random()*(6));
                sum += num[i][j];
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        System.out.println("Suma: "+sum);
        System.out.println("Media: "+(sum/16));
    
    }
}