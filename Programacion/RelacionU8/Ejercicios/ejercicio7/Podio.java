import java.util.ArrayList;
public class Podio{
    public static void main(String [] args){
        //Creamos la clasificacion del torneo
        ArrayList<String> clasificacion = new ArrayList<>();

        clasificacion.add("Ana");
        clasificacion.add("Carlos");
        clasificacion.add("Beatriz");
        clasificacion.add("David");
        clasificacion.add("Elena");

        mostrarClasificacion(clasificacion);


        clasificacion.remove("Beatriz");
        System.out.println("Beatriz fue eliminada");
        mostrarClasificacion(clasificacion);

        clasificacion.remove("David");
        System.out.println("David remonta y se pone en cabeza");
        clasificacion.addFirst("David");
        mostrarClasificacion(clasificacion);

        clasificacion.set(clasificacion.indexOf("Carlos"),"Zacarías");
        System.out.println("Carlos es sustituido por Zacarías");
        mostrarClasificacion(clasificacion);

        System.out.println("*****El Podio Final*****");
        for(int i = 0; i < 3; i++){
            System.out.printf("%d ---> %s",i,clasificacion.get(i));
        }

        
    }

    public static void mostrarClasificacion(ArrayList<String> array){
        for(int i = 0; i < 3; i++){
            System.out.printf("%d ----> %s\n",i+1,array.get(i));
        }
    }
}