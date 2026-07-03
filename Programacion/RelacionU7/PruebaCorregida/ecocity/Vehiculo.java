package ecocity;
public abstract class Vehiculo implements Alquilable{
    //Atributos
    protected String idVehiculo;
    protected String marca;
    protected double tarifaBaseDiaria;

    //Constructor
    public Vehiculo(String idVehiculo, String marca, double tarifaBaseDiaria){
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.tarifaBaseDiaria = tarifaBaseDiaria;
    }

    //Metodos
    @Override
    public String toString(){
        return String.format("idVehiculo: %s\nMarca: %s\nTarifaBaseDiaria: %.2f\n");
    }
}