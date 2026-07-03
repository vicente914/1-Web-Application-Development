import java.util.LinkedList;
public class Navegador{
    public static void main(String[] args){
        LinkedList<String> historial = new LinkedList<>();

        historial.addFirst("https://www.google.com/search?q=google.com");
        historial.addFirst("wikipedia.org/Java");
        historial.addFirst("stackoverflow.com");
        historial.addFirst("github.com");

        System.out.println(historial.peekFirst());

        historial.removeLast();
        //System.out.println(historial);

        String paginaBorrada = historial.removeFirst();

        System.out.printf("Saliendo de [%s], volviendo a [%s]\n",paginaBorrada, historial.peekFirst());

        System.out.println();
        System.out.println("***Historial***");
        for(String i: historial){
            System.out.println(i);
        }
    }
}