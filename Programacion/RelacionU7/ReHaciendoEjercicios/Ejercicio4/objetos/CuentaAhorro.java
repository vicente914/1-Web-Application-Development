package objetos;
public class CuentaAhorro extends Cuenta{
    //Atributos
    private double tipoDeInteres;

    //Constructor
    public CuentaAhorro(){}

    public CuentaAhorro(String titular, String codigo, double saldo, double cuotaMantenimiento, double tipoDeInteres){
        super(titular, codigo, saldo, cuotaMantenimiento);
        this.tipoDeInteres = tipoDeInteres;
    }

    //metodos
    public void setTipoDeInteres(double tipoDeInteres){
        this.tipoDeInteres = tipoDeInteres;
    }

    public double getTipoDeInteres(){
        return tipoDeInteres;
    }

    @Override
    public boolean aplicarComisiones(){
        double interesesGenerados = saldo * tipoDeInteres;
        saldo += interesesGenerados;
        super.aplicarComisiones();
    }
}