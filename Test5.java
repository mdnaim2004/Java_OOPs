class Test5{
	   void show()throws RuntimeException{
		System.out.println("Test class ka method");
	}
}
class Xyz extends Test5{
	 void show() {
		System.out.println("xyz class ka method");
	}

	public static void main(String args[]){
		Test5 t = new Test5();
		t.show();

		Xyz x = new Xyz();
		x.show();
	}

}