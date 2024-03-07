public class ejercicio9 {

    public static void main(String[] args) {
        System.out.println("FACTURA");
        System.out.println("------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Producto", "Cantidad", "Precio Uni", "Total");
        System.out.println("------------------------------");
        System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", "Camiseta", 2, 19.99, 39.98);
        System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", "Pantalón", 1, 29.99, 29.99);
        System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", "Zapatos", 1, 39.99, 39.99);
        System.out.println("------------------------------");
        System.out.printf("%-36s %-10.2f\n", "TOTAL", 109.96);
    }

}
