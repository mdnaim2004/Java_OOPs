import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int d = s.nextInt();
        String m = s.next();
        int y = s.nextInt();

        int miss = s.nextInt();

        if(y% 400 == 0 && d == 29){
            miss = 4*miss;
            int a = (2025 - y - miss)/4;

            System.out.println(a);

        }
        else if( y % 4 == 0 && y % 100 != 0 && d == 29){
            miss  = 4 * miss;
            int a = (2025 - y - miss)/4;

            System.out.println(a);
        }
        else{
            int a = 2025 - y - miss;
            System.out.println((a));
        }
    }
}
