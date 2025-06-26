public class TryCatch {
    public static void main(String[] args) {
        try{
            int data = 50/0;

        }
        catch(ArethMaticExpertion e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
