package objetos;
public class Rectangulo extends Figura{
    protected double base;
    protected double altura;

    //Constructor
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //metodos
    @Override
    public double calcularArea(){
        double area = base * altura;
        return area;
    }
}