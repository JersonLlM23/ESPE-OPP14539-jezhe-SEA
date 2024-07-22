
package ec.edu.espe.rolepaymentsystem.controller;
import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Code Masters
 */

public class LoginScreen {
    private Map<String, String> users = new HashMap<>();

    public LoginScreen() {
        
        users.put("admin", "admin");
    }

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de usuario: ");
        String username = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("El usuario ya existe.");
            return;
        }

        Console console = System.console();
        if (console == null) {
            System.out.println("No se puede obtener la consola.");
            return;
        }

        char[] passwordArray = console.readPassword("Ingrese la contrasenia: ");
        String password = new String(passwordArray);

        users.put(username, password);
        System.out.println("Usuario registrado exitosamente.");
    }

    public boolean checkPassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String username = scanner.nextLine();

        if (!users.containsKey(username)) {
            System.out.println("Usuario no encontrado.");
            return false;
        }

        Console console = System.console();
        if (console == null) {
            System.out.println("No se puede obtener la consola.");
            return false;
        }

        char[] passwordArray = console.readPassword("Ingrese la contrasenia: ");
        String enteredPassword = new String(passwordArray);

        if (enteredPassword.equals(users.get(username))) {
            System.out.println("Contrasenia correcta.");
            return true;
        } else {
            System.out.println("Contrasenia incorrecta.");
            return false;
        }
    }
}

