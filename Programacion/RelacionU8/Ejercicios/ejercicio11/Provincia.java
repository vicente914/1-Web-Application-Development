public class Provincia{
    //atributos
    private String abreviatura, nombre;
    private int codigoPostal;

    //constructor
    public Provincia(String abreviatura, String nombre, int codigoPostal){
        this.abreviatura = abreviatura;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }

    //metodos
    public String getAbreviatura(){
        return abreviatura;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCodigoPostal(){
        return codigoPostal;
    }

    @Override
    public String toString(){
        return String.format("(%s, %s, %d)", abreviatura, nombre, codigoPostal);
    }   
}