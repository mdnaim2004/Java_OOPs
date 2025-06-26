public class This {
    void display(){
        System.out.println("Hello ");
    }
    void show(){
        this.display();
    }
    public static void main(String[] args) {
        This t=new This();
        t.show();
    }
}
