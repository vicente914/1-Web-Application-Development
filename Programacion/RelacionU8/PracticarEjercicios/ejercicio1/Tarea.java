import java.util.Iterator;
public class Tarea{
    //atributos
    private String descripcion;
    private int prioridad;

    //constructor
    public Tarea(String descripcion, int prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    //metodos
    public int getPrioridad(){
        return prioridad;
    }

    public String getDescripcion(){
        return descripcion;
    }

    @Override
    public String toString(){
        return String.format("%s, %d",descripcion,prioridad);
    }
}