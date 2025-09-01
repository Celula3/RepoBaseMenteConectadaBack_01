package org.example.celularegisterlogin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Usuario {
    String nombre;
    String tipo; // administrador, cliente, invitado

    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
}

public class HU034JVDaniel {
    public static void main(String[] args) {

        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Bill Gates", "profesional"));
        listaUsuarios.add(new Usuario("Ronaldo", "paciente"));
        listaUsuarios.add(new Usuario("Juan", "moderador"));
        listaUsuarios.add(new Usuario("Ana", "paciente"));
        listaUsuarios.add(new Usuario("Sofía", "moderador"));
        listaUsuarios.add(new Usuario("Marino", "profesional"));


        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tipo de usuario que desea encontrar (profesional, paciente, moderador): ");
        String tipoUsuario = entrada.nextLine();

        System.out.println("\nUsuarios de tipo " + tipoUsuario + ":");

        // Recorremos la lista y mostramos los que coincidan
        for (Usuario usuario : listaUsuarios) {
            if (usuario.tipo.equalsIgnoreCase(tipoUsuario)) {
                System.out.println(usuario.nombre);
            }
        }
    }
}
