public interface I1 {
    void display();
}

abstract class Test7 {
    abstract void display();
    
    void show() throws RuntimeException {
        System.out.println("Test class ka method");
    }
}

class Xyz extends Test7 implements I1 {
    public void display() {
        System.out.println("Display method overridden");
    }

    void show() {
        System.out.println("Xyz class ka method");
    }

    public static void main(String args[]) {
        Xyz x = new Xyz();
        x.display();
        x.show();
    }
}
