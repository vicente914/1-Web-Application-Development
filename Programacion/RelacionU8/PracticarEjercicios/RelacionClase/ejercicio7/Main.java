import java.util.LinkedList;
public class Main{
    public static void main(String[] args){
        LinkedList<String> clasificacion = new LinkedList<>();

        clasificacion.add("Ana");
        clasificacion.add("Carlos");
        clasificacion.add("Beatriz");
        clasificacion.add("David");
        clasificacion.add("Elena");

        imprimirClasificacion(clasificacion);


        clasificacion.remove("Beatriz");
        System.out.println("***** IMPREVISTO *****");
        imprimirClasificacion(clasificacion);


        System.out.println("***** DAVID SUBE A PRIMERA POSICIÓN *****");
        clasificacion.remove("David");
        clasificacion.addFirst("David");
        imprimirClasificacion(clasificacion);


        System.out.println("***** CARLOS SE RETIRA *****");
        clasificacion.set(clasificacion.indexOf("Carlos"), "Zacarias");
        imprimirClasificacion(clasificacion);

        System.out.println("***** PODIO *****");
        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + ".-" + clasificacion.get(i));
        }


    }

    //metodos
    public static void imprimirClasificacion(LinkedList<String> clasificacion){
        for(String i: clasificacion){
            System.out.println(i);
        }
    }
}