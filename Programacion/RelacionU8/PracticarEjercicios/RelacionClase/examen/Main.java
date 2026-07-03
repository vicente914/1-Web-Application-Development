import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        try{
            Inventario inventario = new Inventario();
            Scanner sc = new Scanner(System.in);
            Producto p1 = new ProductoElectronico("PC", "AB0001", 150.0, 5, "24");
            Producto p2 = new ProductoSoftware("Office 365", "SF0002", 90.0, 0, "lincencia12meses");
            
            inventario.anadirProducto(p1);
            inventario.anadirProducto(p2);

            inventario.listarProductos();
            System.out.println("******************************************************************************************************");
            System.out.println("(1) Alta de producto");
            System.out.println("(2) Limpiar obsoletos");
            System.out.println("(3) Generar etiquetas");
            System.out.println("(4) Actualizar stock");
            System.out.println("(5) Salir");

            System.out.print("    Opcion: ");
            int opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("NUEVO PRODUCTO");
                    
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    sc.nextLine();

                    System.out.print("Codigo: ");
                    String codigo = sc.nextLine();
                    
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    System.out.print("Stock: ");
                    int stock = sc.nextInt();

                    System.out.println("Tipo: ");
                    System.out.println(" (1)Electronico");
                    System.out.println(" (2)Software");
                    int tipo = sc.nextInt();

                    if(tipo == 1){
                        System.out.println("Garantía: ");
                        String garantia = sc.nextLine();
                        inventario.anadirProducto(new ProductoElectronico(nombre, codigo, precio, stock, garantia));
                        inventario.listarProductos();

                    }
                    else if(tipo == 2){
                        System.out.println("Licencia: ");
                        String licencia = sc.nextLine();
                        inventario.anadirProducto(new ProductoSoftware(nombre, codigo, precio, stock, licencia));
                        inventario.listarProductos();
                    }
                    else{
                        System.out.println("Introduce un tipo que si existe");
                    }
                    break;
                case 2:
                    inventario.limpiarObsoletos();
                    inventario.listarProductos();
                    break;

                case 3:
                    inventario.getEtiquetas();
                    break;
                case 4:
                    break;

                case 5:
                    break;

            }
        
        }
        catch (IllegalArgumentException e1){
            System.out.println(e1);
        }
        
    }
}