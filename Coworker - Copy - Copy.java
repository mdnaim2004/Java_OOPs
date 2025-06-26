public class Coworker {
    int id;
    String name;
    static String company = "Brainstation";

    Coworker(int id, String name){//parametarize constructor
        this.id = id;
        this.name = name;//this keyword use kora hoichea instance variable k refer korer jonne
        
    }

    void display(){//method
        System.out.println(id);
        System.out.println(name);
        System.out.println(company);
    }

    public static void main(String[] args) {
        Coworker c1 = new Coworker(101, "naim");
        c1.display();

        Coworker c2 = new Coworker(102, "babu");
        c2.display();
    }


    
}
