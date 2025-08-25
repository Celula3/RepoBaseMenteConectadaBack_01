package org.example.celularegisterlogin;

import java.util.Scanner;

public class HU023C3JVDaniel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui voy a organizar el menu
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Registro");
        System.out.println("2. Login");
        System.out.println("3. Salir");
        System.out.print("Seleccione la opción deseada: ");

        //Voy a usar un byte porque en este caso no vamos a usar valores muy grandes
        //Entonces vamos a importar el scanner

        byte opcion = scanner.nextByte();

        //En este caso voy a ejecutar la varible opción con switch
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado: Registro");


                break;
            case 2:
                System.out.println("Has seleccionado: Login");


                break;
            case 3:
                System.out.println("Vuelva pronto");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();

    }
}