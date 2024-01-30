
// Create a basic inheritance hierarchy for a zoo simulation. Assume that the zoo has different types of animals, each with specific attributes and behaviors. Define a base class Animal with common attributes like name, age, and sound. Create two subclasses, Mammal and Bird, each with additional attributes and behaviors specific to their category.

class Animal {
    protected String name;
    protected int age;
    protected String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}

class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String sound, String furColor) {
        super(name, age, sound);
        this.furColor = furColor;
    }

    public void run() {
        System.out.println(name + " is running!");
    }
}

class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, String sound, double wingSpan) {
        super(name, age, sound);
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.println(name + " is flying with a wingspan of " + wingSpan + " meters.");
    }
}

public class ZooSimulationInherit {
    public static void main(String[] args) {
      
        Animal lion = new Mammal("Leo", 5, "Roar", "Golden");
        Animal eagle = new Bird("Eddie", 3, "Screech", 2.5);

        lion.makeSound();
        ((Mammal) lion).run(); 
        System.out.println();

        eagle.makeSound();
        ((Bird) eagle).fly(); 
    }
}
