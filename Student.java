public class Student extends Person {
    int id;
    float gpa;

    public Student(String name, String gender, int age, Address address, int id, float gpa) {
        super(name, gender, age, address);
        this.id = id;
        this.gpa = gpa;
    }

    public void display() {
        super.display();
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
    }
}
