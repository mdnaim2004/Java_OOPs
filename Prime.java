import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.err.println("Enter a number N:");
        if(N <= 1){
            System.err.println("Its not prime");
            return;
        }
        for(int i=0; i<=Math.sqrt(N); i++){
            if(N % i==0){
               int prime = 0;
                break;
            }
        }
        if(prime){
            System.err.println("Its prime:");
            else{
                System.out.println("Not prime");
            }
        }
    }
}
