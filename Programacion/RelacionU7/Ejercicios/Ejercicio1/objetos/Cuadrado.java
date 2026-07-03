package objetos;
public class Cuadrado extends Figura implements Dibujable{
    //Atributos
    private double lado;

    //Constructor
    public Cuadrado(double lado){
        this.lado = lado;
    }

    //Metodos
    @Override
    public double calcularArea(){
        area = lado * lado;
        area *= 100;
        area = Math.round(area);
        area /= 100;
        return area;
    }

    @Override
    public void dibujar() throws Exception{
        if(lado <= 0){
            throw new Exception("No se puede dibujar cuadrado de lado "+this.lado);
        }
        for(int i = 0; i < this.lado; i++)
        {
            for(int j = 0; j < this.lado; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }    
        
    }
}