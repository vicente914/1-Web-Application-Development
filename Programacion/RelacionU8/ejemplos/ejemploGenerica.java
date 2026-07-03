public class ejemploGenerica{
    public static <T> int compararTamano(T[] a, T[] b){
        return a.length-b.length;
    }

    public static void main(String[] args){
        Integer [] v1 = {1,2,3,4};
        Integer [] v2 = {1,2,3,4,5,6};
        System.out.println("Diferencia de tamaño :"+compararTamano(v1,v2));

        Character [] v3 = {1,2,3,4};
        Character [] v4 = {1,2,3,4,5,6};
        System.out.println("Diferencia de tamaño :"+compararTamano(v3,v4));
    }
   
}