import java.util.Scanner;

 // ################################################################################
  // Calcular el perí­metro y área de un rectángulo dada su base y su altura.
  // ################################################################################
  // Análisis    
  // Tenem    os que leer la base y la altura del triangulo y calcular el perí­metro y el
  // área
  // Datos de entrada: base(real), altura(real)
  // Información de salida: perímetro(real) y área(real)
  // Variables: base, altura, perimetro y area (Real)
  // ################################################################################
  // Diseño
  // 1. Leer base y altura
  // 2. Calcular perí­metro(2*base + 2*altura)
  // 3. Calcular área (base * altura
  // 4. Mostrar perí­metro y área
  // ################################################################################
        

public class ejercicio2 {
    
    public static void main(String[] args){

         double base, altura, perimetro, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa para el cálculo del área y perímetro de un rectángulo.");
        System.out.print("Introduce la base: ");
        base = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();
        perimetro = (2*base) + (2*altura);
        area = base * altura;
        System.out.println("El perímetro del rectángulo es: "+perimetro);
        System.out.println("El área del rectángulo es: "+area);

    }
}
