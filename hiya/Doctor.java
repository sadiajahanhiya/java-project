// Abstract class for Doctor
public abstract class Doctor {
    private String name;
    private String specialty;

    // Constructor to initialize common properties
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Abstract method that will be implemented by subclasses
    public abstract void consult();

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Doctor: " + name + ", Specialty: " + specialty;
    }
}
