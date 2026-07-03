package objetos;
public class Coche
{
    private String marca, modelo;
    private int anio;

    //Constructor
    public Coche(String marca, String modelo, int anio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    //toString
    public String toString()
    {
        return String.format("Marca: %s\nModelo: %s\nAño: %d\n",marca,modelo,anio);
    }

    //get Marca

    public String getMarca()
    {
        return marca;
    }
}