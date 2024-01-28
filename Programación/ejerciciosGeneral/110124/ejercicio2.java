// Crea un programa que sume todos los múltiplos de 3 y 5 en un rango específico (por ejemplo, 1 a 100). 
// Utiliza un bucle for para iterar a través de los números en el rango y una declaración if para determinar 
// si cada número es un múltiplo de 3 o 5.


public class ejercicio2 {  
  
    public static void main(String[] args) {
        
        int suma = 0;

        for(int i = 0; i<=100; i++){
            if(i%3==0 || i%5==0){
                suma += i;
            }
        }

        System.out.println("La suma total de los múltiplos de 5 y 3 de 1 a 100 es: "+suma);
    }    
}
