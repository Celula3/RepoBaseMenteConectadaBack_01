package org.example.celularegisterlogin;

import java.util.ArrayList;
import java.util.Scanner;

public class HU039C3JVDilan {
    public static void main(String[] args) {
        ArrayList<String> nombres =new ArrayList<>();
        ArrayList<String> correos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Mostrar total de usuarios");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese su nombre");
                    String nombre = scanner.next();

                    System.out.println("Ingrese su correo");
                    String correo = scanner.next();

                    nombres.add(nombre);
                    correos.add(correo);

                    System.out.println("Usuario agregado.☑️");
                    System.out.println("Total actualizado:" + nombres.size());
                    break;

                case 2:
                    if (nombres.isEmpty()){
                        System.out.println("No hay usuarios registrados");
                    }else {
                        System.out.println("---Lista de usuarios---");
                        for (int i = 0; i < nombres.size(); i++) {
                            System.out.println((i+1) + " . " + nombres.get(i) + " | " + correos.get(i));
                        }
                        System.out.println("Total de usuarios " + nombres.size());
                    }
                    break;

                case 3:
                    System.out.println("Total de usuarios " + nombres.size());
                    break;

                case 4:
                    System.out.println("Saliendo... Vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion !=4);
    }
}
