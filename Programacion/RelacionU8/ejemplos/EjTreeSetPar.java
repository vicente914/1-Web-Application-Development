import java.util.TreeSet;
public class EjTreeSetPar{
    public static void main(String[] args){
        //Conjunto para guardar los objetos
        TreeSet <Par> pares = new TreeSet<>();

        //Guardamos dos pares en el conjunto
        Par par1 = new Par("Madrid", 25);
        Par par2 = new Par("Barcelona", 19);
        Par par3 = new Par("Granada", 19);

        pares.add(par1);
        pares.add(par2);
        pares.add(par3);

//Mostrar valores
        for(Par i : pares){
            System.out.println(i);
        }

    }
}