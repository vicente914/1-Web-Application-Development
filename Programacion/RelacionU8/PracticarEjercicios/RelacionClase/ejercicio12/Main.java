import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        
        //Creamos cada tipo de mapa
        
        
        Provincia p1 = new Provincia("GR","Granada",18);
        Provincia p2 = new Provincia("J","Jaen",23);
        Provincia p3 = new Provincia("AL","Almeria",04);
        Provincia p4 = new Provincia("CO","Cordoba",14);
        Provincia p5 = new Provincia("SE","Sevilla",41);
        Provincia p6 = new Provincia("MA","Malaga",29);
        Provincia p7 = new Provincia("CA","Cadiz",11);
        Provincia p8 = new Provincia("H","Huelva",21);

        Map<Provincia, Integer> hash = new HashMap<>();
        System.out.println("***** HASHMAP ******");
        hash.put(p1, p1.getCodPostal());
        hash.put(p2, p2.getCodPostal());
        hash.put(p3, p3.getCodPostal());
        hash.put(p4, p4.getCodPostal());
        hash.put(p5, p5.getCodPostal());
        hash.put(p6, p6.getCodPostal());
        hash.put(p7, p7.getCodPostal());
        hash.put(p8, p8.getCodPostal());
        hash.put(p1, p1.getCodPostal());

        for(Map.Entry<Provincia, Integer> m: hash.entrySet()){
            System.out.println(m);
        }


        System.out.println();
        System.out.println("***** LinkedHashMap *****");
        Map<Provincia, Integer> linked = new LinkedHashMap<>(hash);
        imprimirMap(linked);


        System.out.println();
        System.out.println("***** TreeMap *****");
        Map<Provincia, Integer> tree = new TreeMap<>(hash);
        imprimirMap(tree);

    }

    public static void imprimirMap(Map<Provincia, Integer> map){
        for(Map.Entry<Provincia, Integer> m: map.entrySet()){
            System.out.println(m);
        }
    }
}