import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HU035C3JVJacobo {

    private static final List<String> correosRegistrados = new ArrayList<>();
    public static void main(String[] args) {

        correosRegistrados.add("hola123@gmail.com");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu correo para registrarte: ");
        String correo = scanner.nextLine();

        if (correoYaRegistrado(correo)) {
            System.out.println("El correo ingresado ya está registrado. Por favor, utiliza otro correo. :(");
        } else {
            correosRegistrados.add(correo);
            System.out.println("✅Registro exitoso");
        }
    }


    private static boolean correoYaRegistrado(String correo) {
        return correosRegistrados.contains(correo);
    }
}
