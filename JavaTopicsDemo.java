import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Basic class with inheritance and encapsulation
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Interface example
interface Movable {
    void move();
}

class Car implements Movable {
    public void move() {
        System.out.println("Car is moving.");
    }
}

// Exception handling example
class ExceptionHandlingExample {
    public void divide(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}

// File operations example
class FileOperations {
    public void writeToFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(new File(filename));
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}

public class JavaTopicsDemo {
    public static void main(String[] args) {
        // Variables & Operators
        int num = 10;
        double decimal = 20.5;
        boolean flag = true;
        System.out.println("Integer: " + num + ", Double: " + decimal + ", Boolean: " + flag);

        // Loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // Collections example
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("Programming Languages: " + list);

        // Object-Oriented Concepts
        Dog dog = new Dog("Buddy");
        dog.makeSound();

        // Using interface
        Car car = new Car();
        car.move();

        // Exception handling example
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        example.divide(10, 0);

        // File operations example
        FileOperations fileOps = new FileOperations();
        fileOps.writeToFile("example.txt", "Hello, Java!");
    }
}
