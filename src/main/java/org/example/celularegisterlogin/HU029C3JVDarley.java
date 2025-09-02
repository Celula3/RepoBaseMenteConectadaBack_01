package org.example.celularegisterlogin;

import java.util.Scanner;

public class HU029C3JVDarley {
    public static void main(String[] args) {
        Scanner leerdata = new Scanner(System.in);
        final String finalizar="finalizar";
        String finalizarPrograma = "";

        while (!finalizarPrograma.equalsIgnoreCase(finalizar)){
            System.out.println("Digite finalizar para terminar el programa:");
            finalizarPrograma=leerdata.nextLine();
        }
        System.out.println("Ha finalizado con Exito✅");
    }
}
