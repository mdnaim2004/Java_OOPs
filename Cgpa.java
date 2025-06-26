public class Cgpa {
    public static void main(String args[]) {
        double GPA[] = {3.50, 3.75, 4.00, 3.00};
        int Cr[] = {3, 3, 2, 1};
        double total_GPA = 0;
        int total_Credit = 0;

        for (int i = 0; i < GPA.length; i++) {
            total_GPA += GPA[i] * Cr[i];
            total_Credit += Cr[i]; 
        }

        double CGPA = total_GPA / total_Credit;
        System.out.println("CGPA: " + CGPA);
    }
}
