package Public.oop;

abstract class Shape {
    abstract void draw(); // Abstract method (no body)

    void display() { // Concrete method
        System.out.println("Displaying shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() { // Must implement abstract method
        System.out.println("Drawing a circle ⚪");
    }
}