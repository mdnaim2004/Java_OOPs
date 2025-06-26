public class Student extends Person{
    int id;
    float gpa;

    public Student(String name, String gender, int age, Address address, int id, float gpa){
        super(name, gender, age, address); // Supper constructor
        this.id = id;
        this.gpa = gpa;
    }

    public void showResult(){
        System.out.println("ID      : " + id);
        System.out.println("GPA     : " + gpa);
    }
}
