public class ProductoElectronico extends Producto{
    //atributos
    private String garantiaMeses;

    public ProductoElectronico(String nombre, String codigo, double precio, int stock, String garantiaMeses){
        super(nombre, codigo, precio, stock);
        this.garantiaMeses = garantiaMeses;
    }


    //metodos
    @Override
    public String toString(){
        return super.toString() + String.format("%25s|",garantiaMeses);
    }

    @Override
    public String etiqueta(){
        return String.format("-------------------------------------\nNombre: %s\nCodigo: %s\nPrecio: %.2f\nStock: %d\nGarantia: %s",nombre,codigo,precio,stock,garantiaMeses);
    }
}