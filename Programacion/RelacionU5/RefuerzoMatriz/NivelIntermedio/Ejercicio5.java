public class Ejercicio5
{
    public static void main(String[] args)
    {
        //variables
        int[][] matriz = new int[3][3];
        int suma = 0;
        //Resolucion
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = (int)(Math.random()*(6));
                if(i == 0 || j == 0 || i == matriz.length-1 || j == matriz[0].length-1)
                {
                    suma += matriz[i][j];
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma bordes: "+suma);
    }
}