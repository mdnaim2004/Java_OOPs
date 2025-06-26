class A2 {
    A2(){
        System.out.println("I am in class A");
    }
}

class B2 extends A2 {
    B2(){
        super(); // calls A2's constructor
        System.out.println("I am in class B");
    }

    public static void main(String[] args) {
        B2 o = new B2();  // constructor will run automatically
    }
}
