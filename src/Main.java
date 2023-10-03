import com.hampusborg.models.Cat;
import com.hampusborg.models.Dog;
import com.hampusborg.models.Squirrel;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code
public class Main {
    public static void main(String[] args) {

        // instantiate Objects
        Squirrel benny = new Squirrel();
        Cat casper = new Cat();
        Dog fido = new Dog();

        benny.eat(); //Abstract method - Implementation
        benny.makeSound(); // Ordinary Method.

        casper.name();
        casper.eat();
        casper.move();
        casper.makeSound();
        casper.sleep();
        casper.TypeOfAnimal("Cat\n"); // Default method

        fido.name();
        fido.eat();
        fido.move();
        fido.makeSound();
        fido.sleep();
        fido.TypeOfAnimal("Dog"); //Default method

    }
}