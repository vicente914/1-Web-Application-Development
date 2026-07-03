import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        HashSet<String> clase = new HashSet<>();

        //Añadimos los alumnos a nuestra clase
        clase.add("Vicente");
        clase.add("Cristina");
        clase.add("Jesus");
        clase.add("Dylan");
        clase.add("Mateo");

        clase.add("Vicente");

        //Mostramos por pantalla la clase
        for(String i: clase){
            System.out.println(i);
        }
    }
}