import java.util.LinkedList;
import java.util.ListIterator;
public class Historial{
    //atributos
    LinkedList<String> paginas;

    //constructor
    public Historial(){
        paginas = new LinkedList<>();
    }

    //metodos
    public void visitar(String pagina){
        paginas.add(0, pagina);
    }

    public void mostrarHistorial(){
        ListIterator<String> it = paginas.listIterator();
        System.out.println("***** HISTORIAL *****");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    
    
}