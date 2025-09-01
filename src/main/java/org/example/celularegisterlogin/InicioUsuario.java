package org.example.celularegisterlogin;

public class InicioUsuario {
    String correo;
    String contraseña;

    public InicioUsuario(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean validar(String correo, String contraseña) {
        return this.correo.equals(correo) && this.contraseña.equals(contraseña);
    }

    public void cambioContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "'Correo='" + correo + "'Contraseña='" + contraseña + "}";
    }
}
