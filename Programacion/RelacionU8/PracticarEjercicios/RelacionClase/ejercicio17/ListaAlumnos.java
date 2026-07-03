import java.util.ArrayList;
import java.util.Collections;
public class ListaAlumnos{
    ArrayList<Alumno> lista;

    //constructor
    public ListaAlumnos(){
        lista = new ArrayList<>();
    }

    //metodos
    public void agregarAlumno(Alumno alumno){
        lista.add(alumno);
    }

    public void mostrarAlumnos(){
        for(Alumno a: lista){
            System.out.println(a);
        }
    }

    public Alumno buscarAlumno(String nombre){
        Alumno respuesta = null;
        for(Alumno a : lista){
            if(a.getNombre().equals(nombre)){
                respuesta = a;
            }
        }
        return respuesta;
    }

    public void ordenar(){
        Collections.sort(lista);
    }

    public void ordenarPorEdad(){
        Collections.sort(lista, new OrdenPorEdad());
    }
}