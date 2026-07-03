public class Persona
{
    private String nombre;
    private int edad;

    public void mostrarDatos()
    {
        System.out.printf("Nombre: %s\nEdad: %d\n",nombre,edad);
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }
}
