import java.util.ArrayList;
import java.util.List;

public class HU033C3JVJacobo {
    public static void main(String[] args) {
        // Clase local renombrada a UsuarioJacobo
        class UsuarioJacobo {
            private String nombre;
            private int edad;
            private List<String> skills;

            UsuarioJacobo(String nombre, int edad, List<String> skills) {
                this.nombre = nombre;
                this.edad = edad;
                this.skills = skills;
            }

            @Override
            public String toString() {
                return "Usuario { nombre='" + nombre + '\'' +
                        ", edad=" + edad +
                        ", skills=" + skills +
                        " }";
            }
        }

        // Usamos la lista con objetos UsuarioJacobo
        List<UsuarioJacobo> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioJacobo("Ana", 30, List.of("Java", "SQL")));
        usuarios.add(new UsuarioJacobo("Luis", 25, List.of("JavaScript", "HTML")));
        usuarios.add(new UsuarioJacobo("María", 22, List.of("Python", "Django")));

        // Imprime cada usuario con formato claro
        for (UsuarioJacobo u : usuarios) {
            System.out.println(u);
        }
    }
}

