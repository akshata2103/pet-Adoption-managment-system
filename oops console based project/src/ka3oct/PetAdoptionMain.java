package ka3oct;

import java.util.Scanner;

public class PetAdoptionMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet[] pets = new Pet[5];

        pets[0] = new Dog(1, "Bruno", 3);
        pets[1] = new Cat(2, "Kitty", 2);
        pets[2] = new Bird(3, "Mithu", 1);
        pets[3] = new Dog(4, "Rocky", 4);
        pets[4] = new Cat(5, "Luna", 2);

        int choice;

        while (true) {

            System.out.println("\n===== PET ADOPTION SYSTEM =====");
            System.out.println("1. View Pets");
            System.out.println("2. Search Pet");
            System.out.println("3. Adopt Pet");
            System.out.println("4. Return Pet");
            System.out.println("5. Pet Details");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.println("\nAvailable Pets:");

                for (int i = 0; i < pets.length; i++) {

                    if (!pets[i].isAdopted()) {
                        System.out.println(
                            pets[i].getId() + " - " +
                            pets[i].getName()
                        );
                    }
                }

                break;

            case 2:

                System.out.print("Enter Pet ID: ");
                int searchId = sc.nextInt();

                for (int i = 0; i < pets.length; i++) {

                    if (pets[i].getId() == searchId) {
                        pets[i].displayDetails();
                    }
                }

                break;

            case 3:

                System.out.print("Enter Pet ID to adopt: ");
                int adoptId = sc.nextInt();

                for (int i = 0; i < pets.length; i++) {

                    if (pets[i].getId() == adoptId) {

                        if (!pets[i].isAdopted()) {
                            pets[i].adopt();
                            System.out.println("Pet adopted successfully!");
                        } else {
                            System.out.println("Pet is already adopted.");
                        }
                    }
                }

                break;

            case 4:

                System.out.print("Enter Pet ID to return: ");
                int returnId = sc.nextInt();

                for (int i = 0; i < pets.length; i++) {

                    if (pets[i].getId() == returnId) {

                        if (pets[i].isAdopted()) {
                            pets[i].returnPet();
                            System.out.println("Pet returned successfully!");
                        } else {
                            System.out.println("Pet was not adopted.");
                        }
                    }
                }

                break;

            case 5:

                for (int i = 0; i < pets.length; i++) {

                    pets[i].displayDetails();
                    System.out.println("----------------");
                }

                break;

            case 6:

                System.out.println("Thank you!");
                sc.close();
                return;

            default:

                System.out.println("Invalid choice!");
            }
        }
    }
}