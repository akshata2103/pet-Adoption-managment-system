package ka3oct;
public class Dog extends Pet {

    public Dog(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void displayDetails() {
        System.out.println("Dog Details");
        super.displayDetails();
    }
}
