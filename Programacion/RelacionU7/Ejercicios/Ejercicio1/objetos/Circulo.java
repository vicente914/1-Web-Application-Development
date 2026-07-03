package objetos;
public class Circulo extends Figura{
    //Atributos
    private double radio;

    //Constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    //Metodos
    @Override
    public double calcularArea(){
        area = Math.PI * Math.pow(radio, 2);
        area *= 100;
        area = Math.round(area);
        area /= 100;
        return area;
    }
    
}