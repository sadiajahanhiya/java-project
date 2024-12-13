// Patient class to hold patient details
public class Patient {
    private String name;
    private int age;
    private String contact;
    private String symptoms;

    public Patient(String name, int age, String contact, String symptoms) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        return "Patient: " + name + ", Age: " + age + ", Contact: " + contact + ", Symptoms: " + symptoms;
    }
}
