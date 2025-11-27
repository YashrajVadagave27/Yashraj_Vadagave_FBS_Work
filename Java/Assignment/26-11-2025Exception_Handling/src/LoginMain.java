import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public String toString() {
        return "InvalidUsernameException: Incorrect Username!";
    }
}

class InvalidPasswordException extends Exception {
    public String toString() {
        return "InvalidPasswordException: Incorrect Password!";
    }
}

class Login {
    private String username = "admin";
    private String password = "12345";

    public void validateUsername(String enteredUsername) throws InvalidUsernameException {
        if (!enteredUsername.equals(username)) {
            throw new InvalidUsernameException();
        }
    }

    public void validatePassword(String enteredPassword) throws InvalidPasswordException {
        if (!enteredPassword.equals(password)) {
            throw new InvalidPasswordException();
        }
    }
}

public class LoginMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        System.out.print("Enter Username: ");
        String u = sc.nextLine();

        try {
            login.validateUsername(u);
        } catch (InvalidUsernameException e) {
            System.out.println(e.toString());
            System.out.println("Login Failed!");
            return;
        }

        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter Password: ");
            String p = sc.nextLine();

            try {
                login.validatePassword(p);
                System.out.println("Login Successful!");
                return;
            } catch (InvalidPasswordException e) {
                attempts--;
                System.out.println(e.toString());
                System.out.println("Attempts remaining: " + attempts);
            }
        }

        System.out.println("Account Locked!");
    }
}
