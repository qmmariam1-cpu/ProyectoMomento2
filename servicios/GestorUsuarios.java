package servicios;

import interfaces.IOperaciones;
import modelo.Usuario;
import java.util.ArrayList;

public class GestorUsuarios implements IOperaciones {
    
    ArrayList<Usuario> lista = new ArrayList<>();

    @Override
    public void guardar(Usuario u) {
        lista.add(u);
        System.out.println("Guardado!");
    }

    @Override
    public Usuario buscar(String correo) {
        for (int i = 0; i < lista.size(); i++) {
            Usuario u = lista.get(i);
            if (u.getEmail().equals(correo)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public void eliminar(String correo) {
        Usuario u = buscar(correo);
        if (u != null) {
            lista.remove(u);
            System.out.println("Borrado.");
        } else {
            System.out.println("No se encontro.");
        }
    }

    public void mostrarTodos() {
        if (lista.size() == 0) {
            System.out.println("No hay nada guardado.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                Usuario u = lista.get(i);
                System.out.println("Nombre: " + u.getNombre());
                System.out.println("Email: " + u.getEmail());
                u.mostrarRol();
                System.out.println("----------------");
            }
        }
    }
}