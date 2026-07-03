import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        
        //Instanciamos las provincias
        Provincia p1 = new Provincia("GR","Granada",18);
        Provincia p2 = new Provincia("J","Jaen",23);
        Provincia p3 = new Provincia("AL","Almeria",04);
        Provincia p4 = new Provincia("CO","Cordoba",14);
        Provincia p5 = new Provincia("SE","Sevilla",41);
        Provincia p6 = new Provincia("MA","Malaga",29);
        Provincia p7 = new Provincia("CA","Cadiz",11);
        Provincia p8 = new Provincia("H","Huelva",21);

        //Creamos los tres tipos de mapa posibles
        
        LinkedHashMap<Integer,Provincia> l = new LinkedHashMap<>();
        l.put(p1.getCodigoPostal(), p1);
        l.put(p2.getCodigoPostal(), p2);
        l.put(p3.getCodigoPostal(), p3);
        l.put(p4.getCodigoPostal(), p4);
        l.put(p5.getCodigoPostal(), p5);
        l.put(p6.getCodigoPostal(), p6);
        l.put(p7.getCodigoPostal(), p7);
        l.put(p8.getCodigoPostal(), p8);
        l.put(p1.getCodigoPostal(), p1);
        //Mostramos resultado
        System.out.println("LinkedHashMap");
        imprimirMap(l);


        HashMap<Integer,Provincia> provinciasHash = new HashMap<>(l);
        System.out.println("HashMap");
        imprimirMap(provinciasHash);

        
        TreeMap<Integer, Provincia> provinciasTree = new TreeMap<>(l);
        System.out.println("TreeMap");
        imprimirMap(provinciasTree);

    }

    public static void imprimirMap(Map<Integer, Provincia> m){
        for(Provincia p: m.values()){
            System.out.println(p);
        }
    }
}