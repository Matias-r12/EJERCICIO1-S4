public class Main {
    public static void main(String[] args) {

        producto producto1 = new producto("Mouse", 25.50, 10);
        producto producto2 = new producto("Teclado Mecánico", 65.00, 15);
        producto producto3 = new producto("Monitor 24''", 180.00, 8);
        producto producto4 = new producto("Audífonos Bluetooth", 45.90, 20);
        producto producto5 = new producto("Alfombrilla XL", 15.00, 30);

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
        producto4.mostrarInformacion();
        producto5.mostrarInformacion();
        
        System.out.println("\nTotal de productos: " + producto.getContadorProductos());
    }
}
