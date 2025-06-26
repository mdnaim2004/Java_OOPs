public class T1 {
    void show(){
        System.out.println("t1 method");
    }
}
class Xy extends T1 {
   
    void show(){
        super.show();
        System.out.println("xy class method");
    }
    public static void main(String[] args) {
        Xy x = new Xy();
        x.show();
    }
}
