class Test3{
	 protected void show(){
		System.out.println("Test class ka method");
	}
}
class Xyz extends Test3{
	public  void show(){
		System.out.println("xyz class ka method");
	}

	public static void main(String args[]){
		Test3 t = new Test3();
		t.show();

		Xyz x = new Xyz();
		x.show();
	}

}