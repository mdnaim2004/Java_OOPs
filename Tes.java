public class Tes {
    int i;
    void setValu(int i){
        this.i = i;

    }
    void show(){
        System.out.println(i);
    }
}
class Xyz{
    public static void main(String[] args) {
        Tes t = new Tes();
        t.setValu(1010);
        t.show();
    }
}
