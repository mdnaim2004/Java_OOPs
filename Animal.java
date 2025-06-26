abstract class Animal {
    abstract void sleep();
    void eat(){
        System.out.println("Animal eating");
    }
}
class Dog extends Animal{
    void sleep(){
        System.out.println("Dog is sleeping");
    }
}
