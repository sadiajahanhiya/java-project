public class Patien {
    private String name;
    private int age;
    private String contactNumber;
    private String symptoms;

    public Patien(String name, int age, String contactNumber, String symptoms) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getSymptoms() {
        return symptoms;
    }

    @Override
    public String toString() {
        return "Patien Name: " + name + ", Age: " + age + ", Contact: " + contactNumber + ", Symptoms: " + symptoms;
    }
}
