import java.util.TreeSet;
public class AgendaCorregida{
    //Atributos
    private TreeSet<Contacto> agenda;
    
    //Constructor
    public AgendaCorregida(){
        agenda = new TreeSet<>();
    }

    //Metodos

    //metodo para añadir contactos
    public boolean addContacto(Contacto c){
        return agenda.add(c);
    }

    public static void main(String[] args){
        //Creamos una agenda
        AgendaCorregida a1 = new AgendaCorregida();

        //Creamos contactos
        Contacto c1= new Contacto("Ana","1","@Ana");
        Contacto c2= new Contacto("Juan","2","@Juan");
        Contacto c3= new Contacto("Luna","3","@Luna");

        a1.addContacto(c1);
        a1.addContacto(c2);
        a1.addContacto(c3);

        for(Contacto i: a1.agenda){
            System.out.println(i);
        }

    }
}