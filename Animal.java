public class Animal {
    void Animal(){
        System.out.println("Animal constructor");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog constructor");
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Animal();
    }
}