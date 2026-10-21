package modelo;

public class Administrador extends Usuario {
    
    String cargo;

    public Administrador(String nombre, String email, String cargo) {
        super(nombre, email);
        this.cargo = cargo;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Es Admin y su cargo es: " + cargo);
    }
}
