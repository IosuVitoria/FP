// Escribe un programa que calcule el contenido de GC en una cadena de ADN. 
// El usuario ingresará la cadena, y el programa deberá determinar el porcentaje de pares de bases que son guanina (G) o citosina (C).

import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args) {
        
        String secuenciaADN; 
        double contadorGC=0;
        double contadorTotal=0;
        double resultado;


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la secuencia de ADN que a la que miraremos su contenido %GC: ");
        secuenciaADN = sc.nextLine();
        
        for (int i = 0; i < secuenciaADN.length(); i++) {
            if (secuenciaADN.charAt(i) == 'C' || secuenciaADN.charAt(i) == 'C' || secuenciaADN.charAt(i) == 'G' || secuenciaADN.charAt(i) == 'g') {
                contadorGC+=1;
                contadorTotal+=1;
            }else {
                contadorTotal+=1;
            }
        }

        resultado = (contadorGC/contadorTotal)*100;
        // System.out.println(contadorGC);
        // System.out.println(contadorTotal);
        
        System.out.println("El % de GC en la secuencia es: "+resultado+"%.");

    }
}


