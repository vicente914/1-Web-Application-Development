import objetos.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
        ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

        EmpleadoFijo fijo1 = new EmpleadoFijo("Ana", 6, 10);
        EmpleadoComision com1 = new EmpleadoComision("Vicente", 8, 2000, 35);

        trabajadores.add(fijo1);
        trabajadores.add(com1);

        for(int i = 0; i < trabajadores.size(); i++){
            trabajadores.get(i).mostrarInfo();
            System.out.println(trabajadores.get(i).calcularSalario());
        }
    }
}