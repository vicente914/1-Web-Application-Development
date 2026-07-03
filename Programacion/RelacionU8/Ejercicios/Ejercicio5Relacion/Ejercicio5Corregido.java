import java.util.HashSet;
public class Ejercicio5Corregido{
    public static void main(String[] args){
        HashSet<String> alumnos = new HashSet<>();

        //Añadimos a la colección
        alumnos.add("Sergio");
        alumnos.add("Jose");
        alumnos.add("Maria");
        alumnos.add("Elena");
        
        if(!alumnos.add("Elena")){
            System.out.println("Alumno repetido.");
        }

        for(String alum: alumnos){
            System.out.println(alum);
        }
    }
}