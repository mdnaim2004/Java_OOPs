class Empolye{
	String name;
	int id;

	Empolye(String name,int id){
		this.name=name;
		this.id=id;
	}

 public static void main(String args[]){
	 Empolye e1 = new Empolye("abcd",101);
	 Empolye e2 = new Empolye("ABCD",102);
	 Empolye e3 = new Empolye("Abcd",103);
	System.out.println("Empolye 1:"+e1.name+"\t"+e1.id);
        System.out.println("Empolye 2:"+e2.name+"\t"+e2.id);
	System.out.println("Empolye 3:"+e3.name+"\t"+e3.id);

	}
}