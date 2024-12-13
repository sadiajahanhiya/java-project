// Concrete class for Cardiologist
public class Cardiologist extends Doctor {
    public Cardiologist(String name) {
        super(name, "Cardiology");
    }

    @Override
    public void consult() {
        System.out.println(getName() + " is providing a cardiology consultation.");
    }
}
