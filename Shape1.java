abstract class Shape1 {
    abstract void draw();
}
class Circle extends Shape1{
    void draw(){
        System.out.println("drawing circle");
    }
}
class Main{
    public static void main(String[] args) {
        Shape1 s = new Circle();
        s.draw();
    }
}
