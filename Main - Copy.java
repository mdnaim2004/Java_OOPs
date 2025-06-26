import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ch = in.nextInt();

        switch (ch) {
            case 1:
                Rectangle r = new Rectangle(in.nextDouble(),in.nextDouble());
                double area = r.calculateleArea();
                System.out.println(area);

                break;

                case 2:
                    Circle c = new Circle(in.nextDouble());
                    double Area = c.calculateleArea();
                    System.out.println(Area);

                default:
                 break;

        
        }
    }
}
