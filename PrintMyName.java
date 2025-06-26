package Function.java;

import java.util.Scanner;

public class PrintMyName {
    public static void PrintMyName(String name) {
        System.out.println(name);
        return;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextInt();
        PrintMyName(name);
    }
}
