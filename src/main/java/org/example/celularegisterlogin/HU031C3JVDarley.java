package org.example.celularegisterlogin;

import java.util.Scanner;

public class HU031C3JVDarley {
    public static void main(String[] args) {
        Scanner leerdata = new Scanner(System.in);

        String[] tiposUsuario = {"General", "Especialista", "Servidor Público"};

        System.out.println("***** Listado de tipos de usuario *****");

        for (int i = 0; i < tiposUsuario.length; i++) {
            System.out.println((i + 1) + ". " + tiposUsuario[i]);
        }

        System.out.println("Seleccione un tipo de usuario (1-" + tiposUsuario.length + "):");
        int opcion = leerdata.nextInt();

        if (opcion >= 1 && opcion <= tiposUsuario.length) {
            System.out.println("✅ Usted seleccionó: " + tiposUsuario[opcion - 1]);
        } else {
            System.out.println("❌ Opción no válida. Ejecute el programa nuevamente.");
        }
    }
}
