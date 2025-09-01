package org.example.celularegisterlogin;

import java.util.Scanner;

public class HU037C3JVDilan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        confirmarDatos confirmarDatos = null;
        boolean confirmado = false;

        while (!confirmado){
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su correo: ");
            String correo = scanner.nextLine();

            System.out.print("Digite su edad: ");
            Byte edad = scanner.nextByte();

            System.out.print("Cual es su telefono: ");
            String telefono = scanner.next();

            confirmarDatos = new confirmarDatos(nombre,correo,edad,telefono);
            System.out.println("Sus datos son: ");
            System.out.println(confirmarDatos);

            System.out.println("Confirma que sus datos son correctos (SI/NO): ");
            String respuesta = scanner.next().toUpperCase();

            if (respuesta.equals("SI")){
                confirmado = true;
                System.out.println(" \n Datos guardados con éxito");
            }else {
                System.out.println("Ingresa de nuevo los datos: ");
            }

        }
    }
}
