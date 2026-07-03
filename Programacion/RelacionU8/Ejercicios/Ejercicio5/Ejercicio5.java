import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.HashSet;
public class Ejercicio5
{
    public static void main(String[] args){
        HashSet <Integer> datos = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        
        for(int i = 0; i < 5; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número distinto 5 veces: "));
            if(datos.contains(num)){
                i--;
            }
            else{
                datos.add(num);
            }
        }
          

        int suma = 0;
        for(Integer i: datos){
            System.out.println(i);
            suma += i;
        }
        System.out.println("Suma: "+suma);

        
    }
}