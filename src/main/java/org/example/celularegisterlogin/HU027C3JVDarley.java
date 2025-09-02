package org.example.celularegisterlogin;

import java.util.Scanner;

public class HU027C3JVDarley {
    public static void main(String[] args) {
        Scanner leerdata = new Scanner(System.in);

        final String ingresoUsuario="administrador";
        final String contrasenaUsuario="adminadmin";
        int contadorIntentos=0;
        boolean accesoConcedido=false;

        while (contadorIntentos < 3){
            System.out.println("Digite por favor su Usuario: ");
            String usuario=leerdata.nextLine();
            System.out.println("Digite por favor su clave de Acceso");
            String contraseña=leerdata.nextLine();
            if (usuario.equalsIgnoreCase(ingresoUsuario.toLowerCase()) && contraseña.equalsIgnoreCase(contrasenaUsuario.toLowerCase())){
                System.out.println("Ingreso Exitoso✅");
                accesoConcedido=true;
                break;
            }else{
                contadorIntentos++;
                System.out.println("Usuario o Contraseña Incorrecta, le quedan "+ (3-contadorIntentos)+" intentos");
            }
        }
        if (!accesoConcedido){
            System.out.println("***************************************************************************");
            System.out.println("Ha superado el número MAXIMO de intentos, su cuenta ha sido bloqueada❌");
        }
    }
}
