public class Main {
    public static void main(String[] args) {
        Address address = new Address("Rajshahi", "Bogura","Kazi Nazrul Islam Aveneu", "A/202-25");

        Student s = new Student("Nahid", "Male", 72, address, 23, 2.50f);

        s.showInfo();
        s.showResult();
    }
}
