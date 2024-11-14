package Day_23;

public class Animal {
    private String name;

    // Constructor for Animal class
    public Animal(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error Invalid Input");
        } else {
            this.name = name;
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error Invalid Input");
        } else {
            this.name = name;
        }
    }

    // Method to display Animal details
    public void displayDetails() {
        System.out.println("Animal Name: " + name);
    }
}

// Mammal Class
class Mammal extends Animal {
    private boolean hasFur;

    // Constructor for Mammal class
    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }

    // Getter for hasFur
    public boolean getHasFur() {
        return hasFur;
    }

    // Setter for hasFur
    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    // Overridden method to display Mammal details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
    }
}

// Dog Class
class Dog extends Mammal {
    private String breed;

    // Constructor for Dog class
    public Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur);
        if (breed == null || breed.isEmpty()) {
            System.out.println("Error Invalid Input");
        } else {
            this.breed = breed;
        }
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        if (breed == null || breed.isEmpty()) {
            System.out.println("Error Invalid Input");
        } else {
            this.breed = breed;
        }
    }

    // Overridden method to display Dog details
    @Override
    public void displayDetails() {
        System.out.println("Dog Details:");
        super.displayDetails();
        System.out.println("Breed: " + breed);
    }
}



