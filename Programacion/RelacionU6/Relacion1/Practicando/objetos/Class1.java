package objetos;
public class Class1{
    private String name;
    private int edad;

    public Class1(String name, int edad)
    {
        this.name = name;
        this.edad = edad;
        System.out.printf("Hola %s tienes %d años\n", name, edad);
    }
}