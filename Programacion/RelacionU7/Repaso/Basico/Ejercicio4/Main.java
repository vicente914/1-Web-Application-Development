import objetos.*;
public class Main{
    public static void main(String[] args)
    {
        Empleado empleado = new Empleado("Vicente", 1700);
        Gerente gerente = new Gerente("Alvaro", 2000, 300);

        System.out.printf("Salario base del empleado: %d\n",empleado.calcularSalario());
        System.out.printf("Salario del gerente: %d\n",gerente.calcularSalario());
    }
}