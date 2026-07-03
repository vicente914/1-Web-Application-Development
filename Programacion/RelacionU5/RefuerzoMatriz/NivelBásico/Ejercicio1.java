import java.util.Scanner;
public class Ejercicio1
{
    public static void main(String[] args)
    {
        //Declaración de variables y objetos
        Scanner sc = new Scanner(System.in);
        int[][] num = {
            {11,2,3},
            {4,55,6},
            {27,8,9} };
        int i, j;
        
        //Resolución del problema
        System.out.println("--------------");
        for(i = 0; i < num.length; i++)
        {
            for(j = 0; j < num[i].length; j++)
            {
                System.out.printf("%-3d| ",num[i][j]);
            }
            System.out.println();
        };
         System.out.println("--------------");
    }
}