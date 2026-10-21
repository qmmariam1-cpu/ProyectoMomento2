package modelo;

public class Cliente extends Usuario {
    
    int edad;

    public Cliente(String nombre, String email, int edad) {
        super(nombre, email);
        this.edad = edad;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Es Cliente y tiene " + edad + " años");
    }
}