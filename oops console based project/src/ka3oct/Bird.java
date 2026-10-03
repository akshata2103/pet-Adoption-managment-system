package ka3oct;

public class Bird extends Pet {

    public Bird(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void displayDetails() {
        System.out.println("Bird Details");
        super.displayDetails();
    }
}