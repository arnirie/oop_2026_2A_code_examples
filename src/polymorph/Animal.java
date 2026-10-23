package polymorph;

public class Animal {
    private String name;

    public String getName(){
        return name;
    }

    public void displayInfo(){
        IO.println(name);
    }

    public void makeSound(){
        IO.println("hello");
    }
}

class Bird extends Animal{

}

class Dog extends Animal{

    @Override
    public void makeSound(){
        IO.println("arf arf");
    }

}

class Cat extends Animal{

    @Override
    public void makeSound(){
        IO.println("meow meow");
    }

}

class AnimalDemo{
    static void main() {
        Animal animal = new Animal();//superclass
//        animal.makeSound();
        Dog dog = new Dog();//sub class
//        dog.makeSound();
        Animal brownie = new Dog();
//        brownie.makeSound();
        Animal kuting = new Cat();
//        kuting.makeSound();

        Animal[] animals = {animal, dog, brownie, kuting, new Cat(), new Bird()};
        for(Animal a : animals){
            a.makeSound();
        }
    }
}
