package Public.oop;

class Encapsulation {
    // Private fields (encapsulated)
    private String name;
    private int age;

    // Public getter/setter methods (controlled access)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        }
    }
}