package objetos;
public class Vehiculo{
    //Atributos
    protected int vehiculosCreados, kmTotales, kmRecorridos;

    //Constructores
    public Vehiculo(int kmTotales, int kmRecorridos){
        vehiculosCreados += vehiculosCreados + 1;
        this.kmTotales = kmTotales;
        this.kmRecorridos = kmRecorridos;
    }

    //Metodos GETTER
    public int getVehiculosCreados(){
        return vehiculosCreados;
    }

    public int getKmTotales(){
        return kmTotales;
    }

    public int getKmRecorridos(){
        return kmRecorridos;
    }

    public void recorrer(int kmRecorridos){
        this.kmRecorridos = kmRecorridos;
    }
}