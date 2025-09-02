import java.util.Scanner;

public class HU036C3JVJacobo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al registro. Puedes escribir 'cancelar' en cualquier momento para salir.");


        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine().trim();
        if (nombre.equalsIgnoreCase("cancelar")) {
            mostrarCancelacion();
            return;
        }


        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine().trim();
        if (correo.equalsIgnoreCase("cancelar")) {
            mostrarCancelacion();
            return;
        }


        System.out.print("Ingrese su país: ");
        String pais = scanner.nextLine().trim();
        if (pais.equalsIgnoreCase("cancelar")) {
            mostrarCancelacion();
            return;
        }


        System.out.println("\n¡Registro completado con éxito!");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("País: " + pais);
    }

    private static void mostrarCancelacion() {
        System.out.println("\nEl registro ha sido cancelado por el usuario.");
    }
}