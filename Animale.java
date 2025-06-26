interface Animale {
    void eat();
} 
class cat{
    void sleep(){
        System.out.println("cat is sleeping");
    }
}
class Dog extends cat implements Animale{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // OK
        d.sleep();;
    }
}