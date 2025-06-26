class A{
	void showA(){
	System.out.println("A class methode !");
	}

}
class B extends A{
	void showB(){
		System.out.println("B class methode !");

	}

}
class C extends B{
	void showC(){
		System.out.println("C class methode !");

	}

	public static void main(String args[]){
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		
		obj1.showA();
		System.out.println("__________________");
		obj2.showA();
 		obj2.showB();
		System.out.println("__________________");
		obj3.showA();
		obj3.showB();
		obj3.showC();


	}

}