public class Ejercicio3
{
    public static void main(String[] args)
    {
        //Variables
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};


        //Resolución
        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num[i].length; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------");

        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num[i].length; j++)
            {
                if(i == j)
                {
                     System.out.print(num[i][j] + " ");
                }
                else
                {
                    System.out.printf("%3s"," ");
                }
            }
            System.out.println();
        }
    }
}