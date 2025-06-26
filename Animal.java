
//super keyword
public class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();     // call parent class method
    }
}



