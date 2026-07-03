import java.util.HashMap;

public class Ejercicio5Relacion{
    public static void main(String[] args){
        
        HashMap <String, Boolean> asistenciaAlumnos = new HashMap<>();

        asistenciaAlumnos.put("Vicente", true);
        asistenciaAlumnos.put("Diego", true);
        asistenciaAlumnos.put("Álvaro", false);
        asistenciaAlumnos.put("Cristina", true);
        asistenciaAlumnos.put("Pablo", true);
        

        for(String i: asistenciaAlumnos.keySet()){
            System.out.println(i);
        }
    }
}