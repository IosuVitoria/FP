public class Strings {

        public static void main(String[] args) {
            // Crear un String utilizando una cadena literal
            String mensaje = "¡Hola, Mundo!";
    
            // Imprimir el mensaje
            System.out.println("Mensaje: " + mensaje);
    
            // Obtener la longitud del String
            int longitud = mensaje.length();
            System.out.println("Longitud del mensaje: " + longitud);
    
            // Obtener el primer carácter del String
            char primerCaracter = mensaje.charAt(3);
            System.out.println("Primer carácter: " + primerCaracter);
    
            // Obtener una subcadena del String
            String subcadena = mensaje.substring(4, 9);
            System.out.println("Subcadena: " + subcadena);
    
            // Concatenar Strings
            String saludo = "¡Hola, ";
            String nombre = "Juan!";
            String mensajeCompleto = saludo + nombre;
            System.out.println("Mensaje completo: " + mensajeCompleto);
        }
    }
    

