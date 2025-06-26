class A {
    int i = 10;

}
class B extends A{
    int i = 20;
    void show(int i){
        System.out.println(i);
        System.out.println(this.i);//child classs ke represent kore
        System.out.println(super.i);//parent class k represent kore
    }
    public static void main(String[] args) {
        B o = new B();
        o.show(30);
    }
}
