class Test1{
	void show(String a, int b){
		System.out.println("Tset class method");
	}

}
class Xyz extends Test1{
	void show(String a,int b){
		System.out.println("xyz class ka method");
	}
	public static void main(String[] args){
		Test1 t = new Test1();
		t.show("Naim",10);

		Xyz x = new Xyz();
		x.show("Naim",10);
	}

}