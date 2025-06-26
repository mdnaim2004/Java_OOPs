interface Shape2 {
    void draw();
}
class Circle implements Shape2{
    public void draw(){
        System.out.println("drawing circle");
    }
}
class Main{
    public static void main(String[] args) {
        Shape2 s = new Circle();
        s.draw();
    }
}
