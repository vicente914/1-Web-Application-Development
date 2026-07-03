public class Garaje
{
    Coche coche = new Coche();

    public int acelerarCoche()
    {
        System.out.println(coche.acelerar());
    }

    public int frenarCoche()
    {
        System.out.println(coche.frenar());
    }

    public String setMarcaCoche(String marca)
    {
        coche.setMarca(marca);
    }
}