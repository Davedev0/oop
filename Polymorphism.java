package Public.oop;

class Bird extends Animal { // Inherits from Animal
    @Override
    void eat() { // Overrides Animal's eat()
        System.out.println("Bird is pecking food!");
    }
}