package objetos;
public class Circulo extends Figura{
    protected double radio;

    //Constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    //metodos
    @Override
    public double calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}