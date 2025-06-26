public class Test {
    public static void main(String[] args) {
        System.out.println("1");
        Test t = new Test();
        t.main(1);
    }

    public static void main(int a) {
        System.out.println("2");
    }
}
