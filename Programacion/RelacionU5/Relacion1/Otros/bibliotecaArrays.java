public class bibliotecaArrays
{
    public static void main(String[] args)
    {
        //Ejercicio1
        //generaArrayInt(5,0,1);

        //Ejercicio2
        //minimoArrayInt(10);

        //Ejercicio3
        //maximoArrayInt(5);

        //Ejercicio4
        //mediaArrayInt(5);
        
        //Ejercicio5
        int[] arrayNum = {1,2,3,4,5};
        //System.out.println(estaEnArrayInt(99,arrayNum));

        //Ejercicio6
        // posicionEnArray(1);

        //Ejercicio7
        //volteaArrayInt(arrayNum);

        //Ejercicio8
        rotaDerechaArrayInt(arrayNum,1);

        //Ejercicio9
        //rotaIzquierdaArrayInt(arrayNum,1);
    }

    
    
    private static void generaArrayInt(int n,int min, int max)
    {
        int[] num = new int[n];

        for(int i=0; i < num.length;i++)
        {
            num[i] = (int)(Math.random()*(max - min + 1))+min;
            System.out.print(num[i]);
        }
        System.out.println();   
    }

    private static void minimoArrayInt(int array)
    {
        int[] num = new int[array];
        int minArray = 99;
        for(int i = 0; i < num.length; i++)
        {
            num[i] = (int)(Math.random()*(21));
            if(num[i] < minArray)
            {
                minArray = num[i];
            }
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("El número minimo del array es: "+minArray);   
    }

    private static void maximoArrayInt(int array)
    {
        int[] num = new int[array];
        int maxArray = 0;
        for(int i = 0; i < num.length; i++)
        {
            num[i] = (int)(Math.random()*(21));
            if(num[i] > maxArray)
            {
                maxArray = num[i];
            }
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("El número minimo del array es: "+maxArray);
    }

    private static void mediaArrayInt(int array)
    {
        int[] num = new int[array];
        int suma = 0;
        for(int i = 0; i < num.length; i++)
        {
            num[i] = (int)(Math.random()*(21));
            System.out.print(num[i]+" ");
            suma += num[i];

        }
        System.out.println();
        System.out.println("La media de todos los números es: "+(Math.round(suma/array)));
    }

    private static boolean estaEnArrayInt(int num, int[] arrayNum)
    {
        for(int i = 0; i < arrayNum.length; i++)
        {
            if(num == arrayNum[i])
            {
                return true;
            }
        }
        return false;

    }

    private static void posicionEnArray(int num)
    {
        int [] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for(int i = 0; i < numArray.length; i++)
        {
            if(numArray[i] == num)
            {
                System.out.printf("%d coincide con %d del array\tPosición: %d\n",num,numArray[i],i);
                break;
            }
            else
            {
                System.out.printf("El numero %d no coincide con %d\n",num,numArray[i]);
            }
        }
    }

    private static void volteaArrayInt(int[] num)
    {
        int[] numArray = new int[num.length];
        int[] invertido = new int[num.length];
       
        System.out.print("Array normal: ");
        for(int i = 0, j = numArray.length - 1; i < numArray.length; i++, j--)
        {
            invertido[j] = num[i];
            System.out.print(num[i] + " ");
        }

        System.out.println();
        System.out.print("Array invertido: ");
        for(int j = 0; j < invertido.length; j++)
        {
            System.out.print(invertido[j] + " ");
        }
        System.out.println();
    }

    public static void rotaDerechaArrayInt(int[] num, int posiciones)
    {
        int[] numNuevo = new int[num.length];

        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        
        
        for(int i = num.length; i < 0; i--)
        {
            numNuevo[i] = num[(i + posiciones) % num.length];
            System.out.print(numNuevo[i] + " ");
        }
        
    }


    public static void rotaIzquierdaArrayInt(int[] num, int posiciones)
    {
        int[] numNuevo = new int[num.length];

        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < num.length; i++)
        {
            numNuevo[i] = num[(i+posiciones) % num.length];
            System.out.print(numNuevo[i] + " ");
        }
        
        
        
    }

}