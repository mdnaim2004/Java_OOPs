public class Test10 {
    static void display(){
        System.out.println("Static method");
    }
    public static void main(String[] args) {
        //Test10 t = new Test10();
        Test10.display();
        Xyz.show();
    }
}
class Xyz{
    static void show(){
        System.out.println("Static method working");
    }
}
