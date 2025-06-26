interface I1 {

    void show();
}
interface I2 {

    void display();
}
class Test implements I1,I2 {
    public void display(){
        System.out.println("Display method");
    }
    public void show(){
        System.out.println("T1 class method");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();

        
       
    }
}
