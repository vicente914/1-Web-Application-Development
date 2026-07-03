public class Ejercicio4
{
    public static void main(String[] args)
    {
        //Variables
        int[][] matriz = {{1,2},{3,4},{5,6}};
        int i, j;
        int fil = matriz.length;
        int col = matriz[0].length;
        int[][] transpuesta = new int[i][j];
        
        //Resolución
        for(i = 0; i < matriz.length; i++)
        {
            for(j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + " ");
                contRow = i;
                contCol = j;
            }
            System.out.println();
        }

        //System.out.println("Filas: "+(contRow+1));
        //System.out.println("Columnas: "+(contCol+1));


        //Matriz transpuesta
        

        for(i = 0; i < matriz.length; i++)
        {
            for(j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}