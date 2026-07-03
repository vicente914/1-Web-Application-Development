public class Coche
{
    private String marca;
    private int velocidad;

    public void acelerar()
    {
        this.velocidad += 1;
        System.out.println(velocidad);
    }

    public void frenar()
    {
        this.velocidad -= 1;
        System.out.println(velocidad);
    }

    public void setMarca(String marca)
    {
        this.marca = marca; 
    }

}