package org.example.celularegisterlogin;

public class confirmarDatos {
    String nombre;
    String correo;
    Byte edad;
    String telefono;

    public confirmarDatos(String nombre, String correo, Byte edad, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(Byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Resumen de datos: \n " +
                "Nombre: " + nombre + "\n" +
                "Correo: " + correo + "\n" +
                "Edad: " + edad + "\n" +
                "Telefono: " + telefono + "\n";
    }
}