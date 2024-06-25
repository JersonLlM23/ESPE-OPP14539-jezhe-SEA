/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.view;
import ec.edu.espe.rolepaymentsystem.controller.EmployeeManager;
import ec.edu.espe.rolepaymentsystem.controller.LoginScreen;
import ec.edu.espe.rolepaymentsystem.controller.PayrollGenerator;
import java.util.Scanner;

/**
 *
 * @author Code Masters
 */
public class MainWindow {
    public static void main(String[] args) {
        LoginScreen loginScreen = new LoginScreen();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("Desea registrar un nuevo usuario? (s/n) o presione 0 para salir: ");
                String response = scanner.nextLine();

                if (response.equals("0")) {
                    exit = true;
                    continue;
                }

                if (response.equalsIgnoreCase("s")) {
                    loginScreen.registerUser();
                }

                if (loginScreen.checkPassword()) {
                    EmployeeManager employeeManager = new EmployeeManager();
                    PayrollGenerator payrollGenerator = new PayrollGenerator();
                    UserInterface userInterface = new UserInterface(employeeManager, payrollGenerator);
                    userInterface.showMainMenu();
                    exit = true; // Salir del bucle después de iniciar sesión con éxito
                } else {
                    System.out.println("Credenciales incorrectas. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Se produjo un error: " + e.getMessage());
                System.out.println("Intente nuevamente.");
            }
        }

        System.out.println("Saliendo del sistema...");
    }
}
 
