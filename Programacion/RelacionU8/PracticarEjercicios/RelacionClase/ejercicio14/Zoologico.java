import java.util.LinkedList;
import java.util.Iterator;
public class Zoologico{
    LinkedList<Animal> zoo;

    public Zoologico(){
        zoo = new LinkedList<>();
    }

    //metodos

    public void agregarAnimal(Animal animal){
        zoo.add(animal);
    }

    public void eliminarAnimal(String nombre){
        Iterator<Animal> it = zoo.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            if(a.getNombre().equals(nombre)){
                it.remove();
            }
        }
    }

    public void listarAnimales(){
        Iterator<Animal> it = zoo.iterator();
        while(it.hasNext()){
            System.out.println("********************");
            System.out.println(it.next());
        }

    }
}