class Student {
    String name;
    int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
    }
}
    public class Main {
    
        public static void main(String[] args) {
            Student sc = new Student("Naim", 0303);
            sc.display();
            
        }
    }
   