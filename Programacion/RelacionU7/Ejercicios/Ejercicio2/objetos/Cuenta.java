package objetos;
public abstract class Cuenta{
    //Atributos
    protected String titular, codigo;
    protected double saldo, cuotaMantenimiento;

    //Constructor
    public Cuenta(){}

    public Cuenta(String titular, String codigo, double saldo, double cuotaMantenimiento){
        this.titular = titular;
        this.codigo = codigo;
        this.saldo = saldo;
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    //Metodos SETTER
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento){
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Metodos GETTER
    public String getTitular(){
        return titular;
    }

    public String getCodigo(){
        return codigo;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getCuotaMantenimiento(){
        return cuotaMantenimiento;
    }

    //Metodos para el saldo
    public void ingresar(double cantidad){
        this.saldo += cantidad;
    }

    
    public boolean reintegrar(double cantidad){
        boolean operacionExitosa;
        if(cantidad <= 0)
        {
            operacionExitosa = false;
        }

        if(saldo >= cantidad)
        {
            this.saldo -= cantidad;
            operacionExitosa = true;
        }
        else{
            operacionExitosa = false;
        }
        
        return operacionExitosa;
    }

    
    public boolean transferir(Cuenta origen, Cuenta destino, double cantidad){
        boolean operacionExitosa;
        if(cantidad <= 0){
            operacionExitosa = false;
        }

        if(origen.saldo >= cantidad){
            origen.saldo -= cantidad;
            destino.saldo += cantidad;
            operacionExitosa = true;
        }
        else{
            operacionExitosa = false;
        }

        return operacionExitosa;
    }

    //Metodo para la cuota de mantenimiento de la cuenta bancaria
    public boolean aplicarComisiones(){
        boolean comisionPagada = false;
        if(saldo >= cuotaMantenimiento){
            saldo -= cuotaMantenimiento;
            comisionPagada = true;
        }

        return comisionPagada;
    }

}