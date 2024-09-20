import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        final int AGE_LIMIT = 18;
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.print("Ingrese su edad: ");

        if (age >= AGE_LIMIT) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        scanner.close();
    }
}