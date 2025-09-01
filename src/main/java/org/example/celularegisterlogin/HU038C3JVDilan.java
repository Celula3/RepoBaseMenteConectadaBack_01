package org.example.celularegisterlogin;

import java.util.ArrayList;
import java.util.Scanner;

public class HU038C3JVDilan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<InicioUsuario> inicioUsuario = new ArrayList<>();
        inicioUsuario.add(new InicioUsuario("Juan@gmail.com", "juan123"));
        inicioUsuario.add(new InicioUsuario("Eliza@gmail.com", "234567"));
        inicioUsuario.add(new InicioUsuario("Ana@gmail.com", "anita2000"));
        inicioUsuario.add(new InicioUsuario("Dilan@gmail.com","dilly##10"));
        inicioUsuario.add(new InicioUsuario("Manuela@gmail.com","manu253940"));

        System.out.println(" Bienvenido ");

        System.out.print(" \n Ingrese su correo: ");
        String correoIngresado = scanner.next();

        System.out.print("Ingrese su contraseña actual: ");
        String contrasenaIngresada = scanner.next();

        InicioUsuario usuarioEncontrado = null;
        for (InicioUsuario u : inicioUsuario) {
            if (u.validar(correoIngresado, contrasenaIngresada)){
                usuarioEncontrado = u;
                break;
            }
        }

        if (usuarioEncontrado != null){
            System.out.println("Todos los datos en orden☑️");

            System.out.println(" Cambio de contraseña ✍️");

            System.out.println("Por favor digite su nueva contraseña: ");
            String nuevaContraseña = scanner.next();

            usuarioEncontrado.cambioContraseña(nuevaContraseña);

            System.out.println("Se ha actulizado con éxito la contraseña");
        }else {
            System.out.println("Correo o contraseña incorrectos");
        }
    }
}
