import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;

        System.out.print("Enter your Name:");
        name = input.nextLine();

        System.out.println("Name="+name);
    }
}
