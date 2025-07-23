package org.example.celularegisterlogin;

import java.util.Scanner;

public class HU026C3JVDarley {
    public static void main(String[] args) {
        //Yo como usuario quiero simular olvido de contraseña desde consola.

        //Solicitando correo

        //Si exite, Ingresar nueva contraseña

        //Muestra mensaje de exito
        Scanner scanner = new Scanner(System.in);

        String correo,contraseña;
        String olvidocontra;

        final String correoExistente="Darley123@gmail.com";

        while (true) {
            System.out.println("¿Has olvidado tu contraseña? SI😁 o NO 🤔");
            // Si O NO
            olvidocontra=scanner.nextLine();
            switch (olvidocontra.toUpperCase()){
                case "SI":
                    do {
                        System.out.println("\n-----------------");
                        System.out.println("Ingrese su correo");
                        correo= scanner.nextLine();
                        System.out.println("-----------------");
                    }while (!correo.equalsIgnoreCase(correoExistente));
                    // el Correo ES DISTINTO (!)  AL CORREO EXISTENTE
                    // TODOS LOS BUCLES SOLO SE EJECUTAN SI SON TRUE

                    System.out.println("\nDigita la nueva contraseña");
                    contraseña = scanner.nextLine();

                    System.out.println("\nLa nueva contraseña es: " + contraseña );
                    System.out.println("Felicidades! 👍👍");
                    break;
                case "NO":
                    break;
                default:
                    System.out.println("Ingresar Datos Correctamente 💀");
                    continue;
            } break;
        }
    }
}
        


