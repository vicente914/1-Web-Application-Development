import java.util.TreeSet;
public class Main{
    public static void main(String[] args){
        TreeSet<Contacto> contactos = new TreeSet<>();
        
        contactos.add(new Contacto("Vicente", "1", "@vicente"));
        contactos.add(new Contacto("Vicente", "1", "@vicente"));
        contactos.add(new Contacto("Dylan", "3", "@dylan"));

        //mostramos por pantalla
        for(Contacto i: contactos){
            System.out.println(i);
        }
    }
}