abstract class Test6{
    abstract void display();
	   void show()throws RuntimeException{
		System.out.println("Test class ka method");
	}
}
class Xyz extends Test6{
    void display(){

        
    }
	 void show() {
		System.out.println("xyz class ka method");
	}

	public static void main(String args[]){
		//Test6 t = new Test6();
		//t.show();

		Xyz x = new Xyz();
		x.show();
	}

}