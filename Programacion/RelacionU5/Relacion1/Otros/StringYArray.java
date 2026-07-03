public class StringYArray
{
    private static String cadena1;
    private static String cadena2;

    public static String concatenarCadenas(String cadena1, String cadena2)
    {
        StringYArray.cadena1 = cadena1;
        StringYArray.cadena2 = cadena2;
       // String concatenar = cadena1 + cadena2;
        return StringYArray.cadena1 + StringYArray.cadena2;
    }

}