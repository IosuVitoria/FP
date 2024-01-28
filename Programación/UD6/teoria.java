
public class teoria {

    public static void main(String[] args) {

        Punto p1 = new Punto();
        Punto p2 = new Punto();

        p1.x = 2;
        p1.y = 6;

        p2.x = 4;
        p2.y = 9;

        System.out.printf("Distancia del punto 1 al origen (0,0): %.2f\n",
                distanciaOrigen(p1.x, p1.y));
        System.out.printf("Distancia del punto 2 al origen (0,0): %.2f\n",
                distanciaOrigen(p2.x, p2.y));
        System.out.printf("Distancia entre los 2 puntos: %.2f\n", distanciaPuntos(p1.x,
                p1.y, p2.x, p2.y));

        System.out.println("Frase de prueba");
    }

    public static double distanciaOrigen(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    public static double distanciaPuntos(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
