import java.util.LinkedList;
public class Main{
    public static void main(String[] args){
        LinkedList<String> historial = new LinkedList<>();

        historial.addFirst("github.com");
        historial.addFirst("stackeroverflow.com");
        historial.addFirst("wikipedia.org/Java");
        historial.addFirst("https://www.google.com/search?q=google.com");


        //La página mas reciente del historial
        System.out.println(historial.peekFirst());

        //Limite de memoria, solo podemos tener 3 paginas en el historial y hay 4, borramos la ultima
        historial.removeLast();

        //Pulsamos el "boton de atras" llendónos a la página anterior
        String tmp = historial.getFirst();
        historial.removeFirst();
        System.out.printf("Saliendo de [%s], volviendo a [%s]\n",tmp, historial.getFirst());

        System.out.println("ESTADO FINAL DEL HISTORIAL");
        for(String h: historial){
            System.out.println(h);
        }
    }
}