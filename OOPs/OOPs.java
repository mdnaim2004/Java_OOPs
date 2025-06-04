class Animal{
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }
}
class Cat extends
    Animal {
        public Cat(String name) {
            super(name);
        }
        
        public void makeSound() {
            System.out.println(getName() + " meows.");
        }
    }
public class OOPs {
    public static void main(String[] args) {
        Animal myDog = new Dog("Kutta");
        Animal myCat = new Cat("Belai");

        myDog.makeSound();
        myCat.makeSound(); 
    }
}
