import java.util.Iterator;
import java.util.ArrayList;
public class ListaTareas{
    //atributos
    ArrayList<Tarea> tareas;

    //constructor
    public ListaTareas(){
        tareas = new ArrayList<>();
    }

    //metodos
    public void anadirLista(Tarea tarea){
        tareas.add(tarea);
    }

    public void imprimirLista(){
        Iterator<Tarea> it = tareas.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    /*Se encarga de borrar de la lista todas las tareas con prioridad mayor a 5*/
    public void borrarPrioridad(){
        Iterator<Tarea> it = tareas.iterator();
        while(it.hasNext()){
            Tarea tmp = it.next();
            if(tmp.getPrioridad() > 5){
                it.remove();
                System.out.println("La tarea "+tmp.getDescripcion()+" fue borrada exitosamente");
            }
        }
    }
}