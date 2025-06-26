package Assignment;
import java.util.*;

public class Circle3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double R = s.nextDouble();
        double pi = 3.14159;
        double A = pi * R * R;

        System.out.printf("A=%.4f\n", A);
    }
}
