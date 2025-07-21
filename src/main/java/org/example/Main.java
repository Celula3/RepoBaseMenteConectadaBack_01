package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Evento> eventos = new ArrayList<>();  // Lista para almacenar eventos

        while (true) {
            System.out.println("===Agregar Eventos===");
            System.out.println("Agrega el nombre del evento:");
            String nombreEvento = scanner.nextLine();

            System.out.println("Agrega la fecha del evento (ej. 2025-07-20):");
            String fechaEvento = scanner.nextLine();

            System.out.println("Agrega el tipo de evento (Charla, taller, etc):");
            String tipoEvento = scanner.nextLine();

            if (!nombreEvento.trim().isEmpty() && !fechaEvento.trim().isEmpty() && !tipoEvento.trim().isEmpty()) {
                Evento evento = new Evento(nombreEvento, fechaEvento, tipoEvento);
                eventos.add(evento);  // Guardamos el evento en la lista
                System.out.println("¡Evento agregado correctamente!");
            } else {
                System.out.println("Por favor, complete todos los campos.");
            }

            System.out.println("¿Quieres agregar otro evento? (sí/no):");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (!respuesta.equals("sí") && !respuesta.equals("si")) {
                break; // Salir del ciclo si la respuesta no es sí
            }
        }

        // Mostrar todos los eventos guardados
        System.out.println("\nLista de eventos guardados:");
        for (Evento e : eventos) {
            System.out.println(e);
        }

        //mi parte
        boolean buscarMas = true;
        while (buscarMas) {
            System.out.println("\n--- Buscar eventos por palabra clave ---");
            System.out.println("Introduce la palabra clave para buscar eventos:");
            String palabraClave = scanner.nextLine().trim().toLowerCase(); //.trim() es para quitar los espacios en blanco

            List<Evento> resultadosBusqueda = new ArrayList<>();
            for (Evento evento : eventos) {
                if (evento.getNombre().toLowerCase().contains(palabraClave)) { //compara la palabra ccon el evento guardado
                    resultadosBusqueda.add(evento);
                }
            }

            System.out.println("\n--- Resultados de la búsqueda ---");
            if (resultadosBusqueda.isEmpty()) {
                System.out.println("No se encontraron eventos con la palabra clave: '" + palabraClave + "'");
                System.out.println("¿Quieres intentar con otra palabra clave? (sí/no):");
                String respuestaBusqueda = scanner.nextLine().trim().toLowerCase();
                if (!respuestaBusqueda.equals("sí") && !respuestaBusqueda.equals("si")) {
                    buscarMas = false;
                    System.out.println("Gracias por tu ingreso");// Salir del bucle de búsqueda
                }
            } else {
                System.out.println("Eventos encontrados con la palabra clave: '" + palabraClave + "'");
                for (Evento resultado : resultadosBusqueda) {
                    System.out.println(resultado);
                }
                // Si se encontraron resultados, preguntar si quiere buscar más
                System.out.println("¿Quieres realizar otra búsqueda? (sí/no):");
                String respuestaBusqueda = scanner.nextLine().trim().toLowerCase();
                if (!respuestaBusqueda.equals("sí") && !respuestaBusqueda.equals("si")) {
                    buscarMas = false; // Salir del bucle de búsqueda
                    System.out.println("Gracias por tu ingreso");
                }
            }
        }

    }
}
