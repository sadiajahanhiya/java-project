import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample Doctors
        doctors.add(new GeneralDoctor("Dr. Smith"));
        doctors.add(new Cardiologist("Dr. Brown"));

        // Main Menu Loop
        while (true) {
            System.out.println("\n---- Medical Center Management System ----");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int option = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (option == 1) {
                // Login
                System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();

                if (User.loginUser(username, password)) {
                    System.out.println("Login successful!");
                    // After login, show the main menu
                    showMainMenu(sc);
                } else {
                    System.out.println("Invalid login credentials.");
                }
            } else if (option == 2) {
                // Register
                User.registerUser();
            } else if (option == 3) {
                System.out.println("Exiting... Bye!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void showMainMenu(Scanner sc) {
        while (true) {
            System.out.println("\n---- Main Menu ----");
            System.out.println("1. View Doctors");
            System.out.println("2. Add Patient");
            System.out.println("3. View All Patients");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int option = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (option == 1) {
                // View Doctors
                System.out.println("\n---- Doctors ----");
                for (Doctor doctor : doctors) {
                    System.out.println(doctor);
                    doctor.consult(); // Example polymorphism in action
                }
            } else if (option == 2) {
                // Add Patient
                System.out.print("Enter patient's name: ");
                String name = sc.nextLine();
                System.out.print("Enter patient's age: ");
                int age = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.print("Enter patient's symptoms: ");
                String symptoms = sc.nextLine();
                System.out.print("Enter patient's contact number: ");
                String contact = sc.nextLine();

                patients.add(new Patient(name, age, contact, symptoms));
                System.out.println("Patient added successfully.");
            } else if (option == 3) {
                // View All Patients
                System.out.println("\n---- Patients ----");
                if (patients.isEmpty()) {
                    System.out.println("No patients registered yet.");
                } else {
                    for (Patient patient : patients) {
                        System.out.println(patient);
                    }
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }
}
