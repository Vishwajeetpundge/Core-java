package Day_23;


public class Main {
    public static void main(String[] args) {
        // Test Case 1: Invalid input
        Dog invalidDog = new Dog("", true, "Golden Retriever");
        
        // Test Case 2: Valid input
        Dog myDog = new Dog("Buddy", true, "Golden Retriever");
        myDog.displayDetails();
    }
}
