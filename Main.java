import java.util.Scanner;
import modelo.Administrador;
import modelo.Cliente;
import modelo.Usuario;
import servicios.GestorUsuarios;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        GestorUsuarios gestor = new GestorUsuarios();
        int op = 0;

        while (op != 6) {
            System.out.println("\nMENU");
            System.out.println("1. Agregar Admin");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Ver todos");
            System.out.println("4. Buscar");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");
            System.out.print("Elija opcion: ");
            
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Nombre: ");
                String nom = sc.nextLine();
                System.out.print("Email: ");
                String mail = sc.nextLine();
                System.out.print("Cargo: ");
                String cargo = sc.nextLine();

                Administrador a = new Administrador(nom, mail, cargo);
                gestor.guardar(a);

            } else if (op == 2) {
                System.out.print("Nombre: ");
                String nom = sc.nextLine();
                System.out.print("Email: ");
                String mail = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                Cliente c = new Cliente(nom, mail, edad);
                gestor.guardar(c);

            } else if (op == 3) {
                gestor.mostrarTodos();

            } else if (op == 4) {
                System.out.print("Correo a buscar: ");
                String mail = sc.nextLine();
                Usuario enc = gestor.buscar(mail);
                
                if (enc != null) {
                    System.out.println("Si esta: " + enc.getNombre());
                    enc.mostrarRol();
                } else {
                    System.out.println("No esta.");
                }

            } else if (op == 5) {
                System.out.print("Correo a borrar: ");
                String mail = sc.nextLine();
                gestor.eliminar(mail);

            } else if (op == 6) {
                System.out.println("Chao!");
            }
        }
        
        sc.close();
    }
}