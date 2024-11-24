// Superclass
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main Class
public class Main_Animal {
    public static void main(String[] args) {
        // Creating objects of each class
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Displaying sounds
        System.out.println("Generic Animal Sound:");
        genericAnimal.makeSound(); // Calls Animal's makeSound()

        System.out.println("\nDog Sound:");
        dog.makeSound(); // Calls Dog's makeSound()

        System.out.println("\nCat Sound:");
        cat.makeSound(); // Calls Cat's makeSound()
    }
}
