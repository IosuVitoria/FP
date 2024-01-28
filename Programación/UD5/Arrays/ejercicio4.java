// Programa que genera 100 números al azar entre 0 y 9 y
// cuenta ls veces que se repite cada uno de ellos.
import java.util.Random;


    public class ejercicio4 {
            
        
    //Explicación de cómo generar números enteros.
      
    // public static void main(String[] args){

    //     Random random = new Random();

    //     int numeroAleatorio = random.nextInt();

    //     //Generar un número entero aleatorio.
    //     System.out.println("número aleatorio: " + numeroAleatorio);

    //     //Generar un número entero aleatorio en un rango.

    //     int rangoInferior = 0;
    //     int rangoSuperior = 1000;
    
    //      int numeroAleatorio = random.nextInt(rangoInferior, rangoSuperior);
    //     System.out.println("Número aleatorio dentro de un rango: " + numeroAleatorio2);

    
    // public static void main(String[] args){

    //     Random random = new Random();
    //     int simulaciones = 0;
    //     int newNumber;
    //     int limiteInferior = 0;
    //     int limiteSuperior = 10;
    //     int[] conteo =  new int[10];

    //     for(int i = 1; i <=100; i++){
    //         int numeroAleatorio = random.nextInt(limiteInferior, limiteSuperior);
    //           simulaciones++;
    //         if(numeroAleatorio == 0){
    //             conteo[0]++;
    //         }else if (numeroAleatorio ==1){
    //             conteo[1]++;
    //         }else if (numeroAleatorio ==2){
    //             conteo[2]++;
    //         }else if (numeroAleatorio ==3){
    //             conteo[3]++;
    //         }else if (numeroAleatorio ==4){
    //             conteo[4]++;
    //         }else if (numeroAleatorio ==5){
    //             conteo[5]++;
    //         }else if (numeroAleatorio ==6){
    //             conteo[6]++;
    //         }else if (numeroAleatorio ==7){
    //             conteo[7]++;
    //         }else if (numeroAleatorio ==8){
    //             conteo[8]++;
    //         }else{
    //             conteo[9]++;
    //         }
    //     }

    //     for(int i = 0; i < conteo.length; i++){
    //         System.out.println("El número " + i + " ha salido " + conteo[i]+ " en la simulación.");
    //     }

    //     System.out.println("Se ha simulado un total de " + simulaciones + " veces.");
    // }

     public static void main(String[] args) {
        Random random = new Random();
        int simulaciones = 100;
        int limiteInferior = 0;
        int limiteSuperior = 10;
        int[] conteo = new int[10];

        for (int i = 0; i < simulaciones; i++) {
            int numeroAleatorio = random.nextInt(limiteSuperior - limiteInferior) + limiteInferior;
            conteo[numeroAleatorio]++;
        }

        for (int i = 0; i < conteo.length; i++) {
            System.out.println("El número " + i + " ha salido " + conteo[i] + " en la simulación.");
        }

        System.out.println("Se ha simulado un total de " + simulaciones + " veces.");
    }
}
