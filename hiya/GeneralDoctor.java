// Concrete class for a General Doctor
public class GeneralDoctor extends Doctor {
    public GeneralDoctor(String name) {
        super(name, "General Medicine");
    }

    @Override
    public void consult() {
        System.out.println(getName() + " is providing a general consultation.");
    }
}
