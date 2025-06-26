public class Person {
    String name, gender;
    int age;
    Address address; // Has-A relation

    public Person(String name, String gender, int age, Address address){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public void showInfo(){
        System.out.println("Name        : " + name);
        System.out.println("Gender      : " + gender);
        System.out.println("Age         : " + age);
        address.showInfo();
   
    }
}
