public class Person {
    String name, gender;
    int age;
    Address address;

    public Person(String name, String gender, int age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        address.display();
    }
}
