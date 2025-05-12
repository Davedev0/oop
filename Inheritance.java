package Public.oop;

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal { // Dog inherits from Animal
    void bark() {
        System.out.println("Dog is barking!");
    }
}