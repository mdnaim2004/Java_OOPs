
class B extends A {
    void showB(){
        System.out.println("B class properties");
    }public static void main(String[] args) {
        B b = new B();
        b.showA(); // Calling method from class A
        b.showB(); // Calling method from class B
    }
}
