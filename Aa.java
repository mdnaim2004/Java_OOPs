class Aa{
	void showAa(){
		System.out.println("Aa class methode!");
	}
}
class Bb extends Aa{
	void showBb(){
		System.out.println("Bb class methode!");
	}
}
class Cc extends Aa{
	void showCc(){
		System.out.println("Cc class methode!");
	}

	public static void main(String args[]){
		Aa o1 = new Aa();
		Bb o2 = new Bb();
		Cc o3 = new Cc();
		System.out.println("_______________");

		o1.showAa();

		System.out.println("_______________");

		o2.showAa();
	 	o2.showBb();
		System.out.println("_______________");

		o3.showAa();
		o3.showCc();
		
	}
}