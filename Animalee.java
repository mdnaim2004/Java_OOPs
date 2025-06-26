class Animalee{
	void eat(){
		System.out.println("I am eating");
	}
}

class Dog extends Animalee{
	public static void main(String args[]){
	
	Dog d=new Dog();
	d.eat();
	System.out.println("Hello dog.....!");
	}

}