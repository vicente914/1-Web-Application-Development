public class ProductoSoftware extends Producto{
    //atributos
    private String licencia;

    public ProductoSoftware(String nombre, String codigo, double precio, int stock, String licencia){
        super(nombre, codigo, precio, stock);
        this.licencia = licencia;
    }

    //metodos
    @Override
    public String toString(){
        return super.toString() + String.format("%25s|",licencia);
    }

    @Override
    public String etiqueta(){
        return String.format("-------------------------------------\nNombre: %s\nCodigo: %s\nPrecio: %.2f\nStock: %d\nGarantia: %s",nombre,codigo,precio,stock,licencia);
    }
}