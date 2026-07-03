import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class AnalizadorTexto{
    //atributos
    private String texto;
    Set<String> palabrasHash;
    Set<String> palabrasLinked;

    //constructor
    public AnalizadorTexto(String texto){
        this.texto = texto;
        palabrasHash = new HashSet<>();
        palabrasLinked = new LinkedHashSet<>();
    }

    //metodos
    public void procesarTexto(){
        texto = texto.toLowerCase().replaceAll("[^a-záéíóúñü\\s]", " ");
        for(String t: palabrasHash){
            if(!texto.length() == 0){
                palabrasHash.add(texto);
                palabrasLinked.add(texto);
            }
        }
    }

    public void mostrarPalabras(){
        System.out.println("***** HashSet *****");
        for(String i: palabrasHash){
            System.out.println(palabrasHash.get(i));
        }
    }
}