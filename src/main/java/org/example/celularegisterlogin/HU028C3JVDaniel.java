package org.example.celularegisterlogin;

import java.util.ArrayList;
import java.util.Scanner;

public class HU028C3JVDaniel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();

        System.out.println("-Registro Usuarios-");
        String opcion;

        do {
            System.out.println("Ingrese el nombre del usuario");
            String usuario = scanner.nextLine();
            usuarios.add(usuario);

            System.out.println("¿Desea agregar otro usuario? (si/no): ");
            opcion =
                    scanner.nextLine().toLowerCase();
        } while (opcion.equals("si"));

        System.out.println("Usuario Registrados:");
        for (int i = 0; i < usuarios.size(); i ++) {
            System.out.println((i + 1) + ". " + usuarios.get(i));
        }
        scanner.close();
        }
    }
