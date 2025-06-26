class This1 {
    This1(){
        this(10);
        System.out.println("no argument constructor ");
    }
    This1(int a){
        System.out.println("Parameteriz constructor");
    }
    public static void main(String[] args) {
       // This1 t=new This1();
        This1 t=new This1();
    }
}
