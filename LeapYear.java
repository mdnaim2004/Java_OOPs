import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Enter an YEAR:");
        year = input.nextInt();

        if((year % 400 == 0)&&((year % 4 == 0)||(year % 100 != 0))){
            System.err.println("LEAP YEAR");
        }
        else{
            System.err.println("NOT LEAP YEAR");
        }
    }
}
