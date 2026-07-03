public class ProductoSoftware extends Producto{
    //atributos
    private String licencia;

    public ProductoSoftware(String nombre, String codigo, double precio, int stock, String licencia) throws Exception{
        super(nombre, codigo, precio, stock);
        this.licencia = licencia;
    }

    //metodos
    @Override
    public String toString(){
        return super.toString() + String.format("%10s|", licencia);
    }
    
}