package org.example.celularegisterlogin;

import java.util.ArrayList;

public class HU040C3JVDilan {
    public static void main(String[] args) {
    ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1,"Juan", "Juan@gmail.com"));
        usuarios.add(new Usuario(2,"Eliza", "Eliza@gmail.com"));
        usuarios.add(new Usuario(3,"Ana", "Ana@gmail.com"));
        usuarios.add(new Usuario(4,"Dilan","Dilan@gmail.com"));
        usuarios.add(new Usuario(5,"Manuela","Manuela@gmail.com"));


        System.out.println("---- Exportación en TABLA ----");
        System.out.println("--------------------------------------------------");

        System.out.println("ID\tNOMBRE\t\tEMAIL");
        for (Usuario u : usuarios){
        System.out.println(u.id + "\t" + u.nombre + "\t\t" + u.email);
    }


        System.out.println(" \n ---- Exportación CSV ----");
        System.out.println("ID,Nombre,Email");
        for (Usuario u : usuarios){
        System.out.println(u.id + "," + u.nombre + "," + u.email + ",");
    }



        System.out.println(" \n --Exportacion Texto Plano-- ");
        for (Usuario u : usuarios){
        System.out.println("Usuario: "  + u.nombre + " | Email: " + u.email);
    }


}
}
 class Usuario {
    public int id;
    public String nombre;
    public String email;


    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
}



