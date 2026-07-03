import java.util.ArrayList;
public class ListaAlumno{
    
    //Atributos
    ArrayList<Alumno> lista;

    //Constructor
    public ListaAlumno(){
        this.lista = new ArrayList<>();
    }

    //metodos
    public void agregarAlumno(Alumno alumno){
        this.lista.add(alumno);
    }

    public void mostrarAlumnos(){
        for(Alumno alumno: lista){
            System.out.println(alumno);
        }
    }

    public Alumno buscarAlumno(String nombre){
        boolean encontrado = false;
        for(int i = 0; i < lista.size(); i++){
            if(nombre.equals(lista.get(i).getNombre())){
                encontrado = true; 
            }
        }
        return lista.get(nombre);
    }
}