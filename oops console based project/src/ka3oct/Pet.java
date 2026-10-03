package ka3oct;

public class Pet {
	

	    private int id;
	    private String name;
	    private int age;
	    private boolean adopted;

	    public Pet(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.adopted = false;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public boolean isAdopted() {
	        return adopted;
	    }

	    public void adopt() {
	        adopted = true;
	    }

	    public void returnPet() {
	        adopted = false;
	    }

	    public void displayDetails() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Adopted: " + adopted);
	    }
	}


