public class ProductoElectronico extends Producto{
    //atributos
    private int garantiaMeses;

    public ProductoElectronico(String nombre, String codigo, double precio, int stock, int garantiaMeses) throws Exception{
        super(nombre, codigo, precio, stock);
        this.garantiaMeses = garantiaMeses;
    }

    //metodos
    @Override
    public String toString(){
        return super.toString() + String.format("%10d|", garantiaMeses);
    }
}