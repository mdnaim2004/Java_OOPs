public class Empolyee {
    int empid;
    String name;
    static String company="BrainStation";

    Empolyee(int empid,String name){
        this.name = name;
        this.empid = empid;
        
    }


    void display(){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(company);
    }
    public static void main(String[] args) {
        Empolyee e1 = new Empolyee(101,"naim");
        e1.display();

        Empolyee e2 = new Empolyee(102,"babu");
        e2.display();

    }
}
