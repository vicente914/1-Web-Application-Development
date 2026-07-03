import java.util.Comparator;
public class OrdenPorEdad implements Comparator<Alumno>{
    @Override
    public int compare(Alumno a1, Alumno a2){
        return a1.getEdad().compareTo(a2.getEdad());
    }
}