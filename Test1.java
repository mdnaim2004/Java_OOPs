class Test1{
	final void show(){
		System.out.println("1");
	}

}
class Xyz extends Test1{
	final void show(){
		System.out.println("2");
	}
	public static void main(String[] args){
		Test1 t = new Test1();
		t.show();

		Xyz x = new Xyz();
		x.show();
	}

}