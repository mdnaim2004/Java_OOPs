abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}
class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        
        shape1.draw(); 
        shape2.draw(); 
    }
}

