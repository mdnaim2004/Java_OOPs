class Tes2{
    Tes2(This t){
        System.out.println("test co structor");
    }
}
class This2 {
    void m1(){
        Tes2 t = new Tes2(this);
        //System.out.println("m1 ka  methods");
    }
    public static void main(String[] args) {
        This2 t = new This2();
        t.m1();
    }
}

