package objetos;
public class CuentaAhorro extends Cuenta{
    //Atributos
    private double tipoDeInteres;

    //Constructores
    public CuentaAhorro(){}

    public CuentaAhorro(String titular, String codigo, double saldo, double cuotaMantenimiento, double tipoDeInteres){
        super(titular, codigo, saldo, cuotaMantenimiento);
        this.tipoDeInteres = tipoDeInteres;
    }

    //Metodos
    public void setTipoDeInteres(double tipoDeInteres){
        this.tipoDeInteres = tipoDeInteres;
    }

    public double getTIpoDeInteres(){
        return tipoDeInteres;
    }

    @Override
    public boolean aplicarComisiones(){
        double interesesGenerados = saldo * tipoDeInteres;
        saldo += interesesGenerados;
       return super.aplicarComisiones();
    }
    


}