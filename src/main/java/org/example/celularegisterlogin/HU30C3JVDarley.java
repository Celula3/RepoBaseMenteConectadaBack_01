package org.example.celularegisterlogin;

import java.util.Scanner;

public class HU30C3JVDarley {
    public static void main(String[] args) {
        Scanner leerdata = new Scanner(System.in);
        boolean exito = false;
        int contadorIntentos = 0;
        boolean salir = true;
        String correo;

        System.out.println("************************************************************");
        System.out.println("Bienvenido al validador de Dirección de Correo Electronico");
        System.out.println("Digite un Nombre de Usuario para el correo:");
        String nombre = leerdata.nextLine();
        System.out.println("Ingrese su Identificador (@) para el correo:");
        String identificador = leerdata.nextLine();
        System.out.println("Ingrese la Empresa o Establecimeinto al que pertenece;");
        String establecimiento = leerdata.nextLine();
        System.out.println("Ingrese su Dominio +(.com, .net, .org, etc);");
        String dominio = leerdata.nextLine();
        correo = nombre + identificador + establecimiento + dominio;

        while (!exito) {
            if (correo.contains("@")) {
                System.out.println("La Dirección de correo es: " + correo.toLowerCase());
                System.out.println("La Dirección de correo es Valida✅");
                exito = true;
            } else
                System.out.println("La Dirección de correo es: " + correo.toLowerCase());
            System.out.println("La Dirección de correo NO es Valida❌");
            System.out.println("lEA BIEN Y DIGITE UN IDENTIFICADOR ( @ ) VALIDO" + "Usted digito: " + identificador);
            break;
        }
    }
}
