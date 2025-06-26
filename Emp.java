class Emp{
	String name;
	int id;

	Emp(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public static void main(String args[]){
		Emp e1 = new Emp("Naim",101);
		Emp e2 = new Emp("naiem",102);

		System.out.println("Empolyes1:"+e1.name+"\t"+e1.id);
		System.out.println("Empolyes2:"+e2.name+"\t"+e2.id);
	}
}