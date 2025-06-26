class Test4{
	  protected void show(){
		System.out.println("Test class ka method");
	}
}
class Xyz extends Test4{
	public void show(){
		System.out.println("xyz class ka method");
	}

	public static void main(String args[]){
		Test4 t = new Test4();
		t.show();

		Xyz x = new Xyz();
		x.show();
	}

}