public class JackedArray {
    public static void main(String[] args) {

        int [][]jac = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i<jac.length; i++){

            for(int j=0; j<jac.length; j++){

                 System.out.print(jac[i][j] + " ");
            }
            System.out.println();
        }
    }
}
