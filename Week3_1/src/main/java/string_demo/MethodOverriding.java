package string_demo;

class Animal {
    public void speak() {
        System.out.println("Animal speaks!");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        
        Dog dog = new Dog();
        dog.speak();
        
        Animal animal2 = new Dog();
        animal2.speak();
    }
}

