public class prime1 {
    public static void Main(String[] args){
        boolean isPrime = 17;
        int number = 17;

        for(int i = 2; i<number; i++){
            if(number % i == 0);
                isPrime = false;
                break;
        }
        if(isPrime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
    }
}
