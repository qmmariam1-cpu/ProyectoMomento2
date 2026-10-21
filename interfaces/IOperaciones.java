package interfaces;

import modelo.Usuario;

public interface IOperaciones {
    
    void guardar(Usuario u);
    
    Usuario buscar(String correo);
    
    void eliminar(String correo);

}