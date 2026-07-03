public class ejemploNoGenerica{
    public static <T> int compararTamano(Object[] a, Object[] b){
        return a.length-b.length;
    }

    public static void main(String[] args){
        Integer [] v1 = {1,2,3,4};
        Integer [] v2 = {1,2,3,4,5,6};
        System.out.println("Diferencia de tamaño :"+compararTamano(v1,v2));

        String [] v3 = {"a","b","c"};
        String [] v4 = {"a","b","c","abc"};
        System.out.println("Diferencia de tamaño :"+compararTamano(v3,v4));
    }
   
}