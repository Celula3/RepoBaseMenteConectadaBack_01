package org.example.celularegisterlogin;

import java.util.Scanner;

public class HU021C3JVDilan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String correo;

        do {
            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();

            if (nombre.isEmpty()){
                System.out.println("El nombre no puede estar vacío. ");
            } else if (nombre.length() < 2) {
                System.out.println("El nombre debe tener al menos 2 caracteres. ");
                nombre = "";
            }
        }while (nombre.isEmpty());
        
        do {
            System.out.print("Ingrese su correo: ");
            correo = scanner.nextLine();
            
            if (correo.isEmpty()){
                System.out.println("El correo no puede estar vacío. ");
            } else if (!correo.contains("@")) {
                System.out.println("El correo debe contener el simbolo '@' ");
                correo = "";
            }
        }while (correo.isEmpty());

        System.out.println("\n ☑️ Registro exitoso☑️ ");
        System.out.println(" Nombre " + nombre);
        System.out.println(" Correo " + correo );



    }
}
