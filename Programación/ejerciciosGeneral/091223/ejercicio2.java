// ################################################################################
// Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados
// por una distancia d.
// El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo
// para ingresar la distancia entre los dos vehículos (km) y sus respectivas
// velocidades (km/h) y con esto determina    r y mostrar en que tiempo (minutos)
// alcanza    rá el vehículo más rápido al otro.
// ################################################################################
// Análisis
// Hay que saber la velocidad de cada vehículo, y la distancia entre ambos
// Hay que calcular el tiempo que tardará el que está detrás (y va más rápido)
// alcanzar al primero.
// Datos de entrada: velocidad1, velocidad2 km/h (real) y distancia (real).
// Información de salida: Tiempo en minutos (real)
// Variables: velocidad1, velocidad2, distancia (real), tiempo (real).
// ################################################################################
// Diseño
// 1. Leer las dos velocidades y la distancia (no puedo controlar que v1 > v2.
// 2. Calcular tiempo: (v=s/t), por lo        t anto t=s/v. Tiempo = distancia / (v1-v2)
// 3. El tiempo hay que pasarlo a minútos
// 4. Mostrar tiempo
// ################################################################################

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double velocidad1, velocidad2, distancia;
        double tiempo;

        System.out.print("Introduce la velocidad a la que viaja el primer coche: ");
        velocidad1 = sc.nextDouble();
        System.out.print("Introduce la velocidad a la que viaja el segundo coche: ");
        velocidad2 = sc.nextDouble();
        System.out.print("Introduce la distancia que les separa: ");
        distancia = sc.nextDouble();
        tiempo = distancia/(velocidad1-velocidad2);
        tiempo = tiempo*60*-1;
        System.out.println("El coche 2 tarda: "+tiempo+" minutos en coger al coche 1. ");
    }

}
