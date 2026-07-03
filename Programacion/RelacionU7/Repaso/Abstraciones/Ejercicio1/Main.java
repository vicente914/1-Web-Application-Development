import objetos.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ///Creamos una lista de instrumentos
        ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
        
        //Instanciamos nuestros instrumentos
        Guitarra guitarra1 = new Guitarra("Lucille");
        Piano piano1 = new Piano("Chopin");

        //AÑadimos los instrumentos a nuestra lista de instrumentos
        instrumentos.add(guitarra1);
        instrumentos.add(piano1);

        for(int i = 0; i < instrumentos.size(); i++){
            instrumentos.get(i).afinar();
            instrumentos.get(i).tocar();
        }

    }
}