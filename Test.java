class Test{
	final void show(int a,int b){
		System.out.println("1");

	}
	void show(int b,int a,int c){
		System.out.println("2");

	}
	public static void main(String []args){
		Test t = new Test();
		t.show(10,20);
	}

}