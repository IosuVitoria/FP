import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una contraseña para cifrar: ");
        String password = scanner.nextLine();

        // Hash de la contraseña usando SHA-256
        String hashedPassword = hashPassword(password);

        System.out.print("Introduce la ruta del archivo de entrada: ");
        String inputFile = scanner.nextLine();

        System.out.print("Introduce la ruta del archivo de salida: ");
        String outputFile = scanner.nextLine();

        System.out.print("Introduce un valor de desplazamiento para el cifrado César: ");
        int displacement = scanner.nextInt();

        try {
            String content = readFile(inputFile);

            // Cifrar el contenido
            String encryptedContent = encrypt(content, displacement);

            // Guardar el contenido cifrado en el archivo de salida
            writeFile(outputFile, encryptedContent);

            System.out.println("El archivo se ha cifrado con éxito y se ha guardado en " + outputFile);

            // Descomentar la siguiente línea para probar la desencriptación
            // System.out.println("Texto descifrado: " + decrypt(encryptedContent,
            // displacement));

        } catch (IOException e) {
            System.err.println("Error al manipular archivos: " + e.getMessage());
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }

    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                String hex = Integer.toHexString(0xff & hashedByte);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al generar hash de contraseña: " + e.getMessage());
        }
    }

    private static String encrypt(String text, int displacement) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                int type = Character.isUpperCase(character) ? 'A' : 'a';
                character = (char) (((character - type + displacement) % 26) + type);
            }
            result.append(character);
        }

        return result.toString();
    }

    private static String decrypt(String text, int displacement) {
        return encrypt(text, 26 - displacement);
    }
}