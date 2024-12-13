import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    // In-memory storage for users
    private static Map<String, String> users = new HashMap<>();

    // Simulate a simple registration process
    public static void registerUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        
        if (users.containsKey(username)) {
            System.out.println("Username already taken. Please choose another username.");
        } else {
            users.put(username, password);
            System.out.println("Registration successful!");
        }
    }

    // Simulate a simple login process
    public static boolean loginUser(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            return true; // Successful login
        }
        return false; // Invalid login credentials
    }
}
