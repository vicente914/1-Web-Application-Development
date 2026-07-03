import java.util.ArrayList;
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
}