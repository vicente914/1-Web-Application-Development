import java.util.TreeSet;

public class Agenda{
    public static void main(String[] args){
        Contacto contacto1 = new Contacto("Vicente", "1", "@vicente");
        Contacto contacto2 = new Contacto("Cristina","2","@cristina");
        Contacto contacto3 = new Contacto("Juan", "3", "@juan");
        Contacto contacto4 = new Contacto("Alvaro", "4", "alvaro");
        
        TreeSet <Contacto> contactos = new TreeSet<>();

        contactos.add(contacto1);
        contactos.add(contacto2);
        contactos.add(contacto3);
        contactos.add(contacto1);
        contactos.add(contacto4);

        for(Contacto i: contactos){
            System.out.println(i);
        }
    }
}