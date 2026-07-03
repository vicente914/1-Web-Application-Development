package objetos;
public class Cuenta{
    //atributos
    protected String titular, codigo;
    protected double saldo, cuotaMantenimiento;

    //Constructor
    public Cuenta(String titular, String codigo, double saldo, double cuotaMantenimiento){
        this.titular = titular;
        this.codigo = codigo;
        this.saldo = saldo;
        this.cuotaMantenimiento = cuotaMantenimiento;
    }  

    //Metodos
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCodigo(String codigo){
        this.titular = titular;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento){
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public String getTitular(){
        return titular;
    }

    public String getCodigo(){
        return codigo;
    }

    public double getCuotaMantemiento(){
        return cuotaMantenimiento;
    }

    public double getSaldo(){
        return saldo;
    }

    public void ingresar(double cantidad){
        saldo += cantidad;
    }

    public boolean reintegrar(double cantidad){
        boolean operacionExitosa = false;
        if(cantidad <= 0){
            operacionExistosa = false;
        }

        if(saldo >= cantidad){
            this.saldo -= cantidad;
            operacionExistosa = true;
        }
        else{
            operacionExistosa = false;
        }

        return operacionExistosa;
    }

    public boolean transferir(Cuenta origen, Cuenta destino, double cantidad){
        boolean operacionExistosa = false;
        if(cantidad <= 0){
            operacionExistosa = false;
        }

        if(origen.saldo >= cantidad){
            origen.saldo -= cantidad;
            destino.saldo += cantidad;
            operacionExistosa = true;
        }
        else{
            operacionExistosa = false;
        }

        return operacionExistosa;
    }

    public boolean aplicarComisiones(){
        boolean comisionesAplicadas = false;
        if(saldo >= cuotaMantenimiento){
            saldo -= cuotaMantenimiento;
            comisionesAplicadas = true;
        }
        return comisionesAplicadas;
    }


}