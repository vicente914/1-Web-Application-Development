import java.util.ArrayList;
import java.util.Iterator;
public class Main{
    public static void main(String[] args){
        //creamos arrayList
        ListaTareas l1 = new ListaTareas();

        //Creamos y guardamos varias tareas en nuestra lista
        l1.anadirLista(new Tarea("Tarea1",3));
        l1.anadirLista(new Tarea("Tarea2",8));
        l1.anadirLista(new Tarea("Tarea3",4));
        l1.anadirLista(new Tarea("Tarea4",50));
        l1.anadirLista(new Tarea("Tarea5",10));

        //lo recorremos con un for each
        /*System.out.println("***** Lista con bucle for each *****");
        for(Tarea c: listaTareas){
            System.out.println(c);
        }*/

        //Mostramos la lista
        System.out.println("***** TAREAS *****");
        l1.imprimirLista();
        
        //BORRAMOS todas las tareas con prioridad mayor a 5
        System.out.println("***** BORRAMOS PRIORIDAD MAYOR A 5 *****");
        l1.borrarPrioridad();

        //Volvemos a mostrar nuestra lista
        System.out.println("***** TAREAS ACTUALIZADA *****");
        l1.imprimirLista();
    }
}