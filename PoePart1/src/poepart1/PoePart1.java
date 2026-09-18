package poepart1;

import java.util.Scanner;

public class PoePart1 {

    public static void main(String[] args) {

        Login login = new Login();
        Scanner scan = new Scanner(System.in);

        // ============================
        // REGISTER PAGE
        // ============================

        System.out.println("===== REGISTER =====");

        System.out.print("Enter username: ");
        String username = scan.nextLine();

        System.out.print("Enter cellphone number: ");
        String cellphone = scan.nextLine();

        System.out.print("Enter password: ");
        String password = scan.nextLine();

        String registrationMessage =
                login.registerUser(username, password, cellphone);

        System.out.println();
        System.out.println(registrationMessage);

        boolean registrationSuccessful =
                login.checkUserName(username)
                && login.checkPasswordComplexity(password)
                && login.checkCellPhoneNumber(cellphone);

        // Only continue if registration is successful
        if (registrationSuccessful) {

            // ============================
            // LOGIN PAGE
            // ============================

            System.out.println();
            System.out.println("===== LOGIN =====");

            System.out.print("Enter first name: ");
            String firstName = scan.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scan.nextLine();

            boolean loginSuccessful =
                    login.loginUser(firstName, lastName);

            System.out.println();
            System.out.println(
                    login.returnLoginStatus(loginSuccessful)
            );
        }

        scan.close();
    }
}