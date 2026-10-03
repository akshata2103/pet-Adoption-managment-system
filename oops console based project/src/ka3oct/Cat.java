package ka3oct;

public class Cat extends Pet {

    public Cat(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void displayDetails() {
        System.out.println("Cat Details");
        super.displayDetails();
    }
}
