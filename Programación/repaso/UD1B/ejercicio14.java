public class ejercicio14 {

    public static void main(String[] args) {
        line(1000);
    }

    public static void line(int count) {
        if (count <= 0) {
            return;
        }
        System.out.println("All work and no play makes Jack a dull boy.");
        line(count - 1);
    }
}
