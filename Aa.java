public class Aa {
    void showAa(){
        System.out.println("Aa class properties");
    }
}
class Bb extends Aa{
    void showBb(){
        System.out.println("Bbclass propertis");
    }
}
class Cc extends Aa{
    void showCc(){
        System.out.println("Cc class method");
    }
    public static void main (String[] args){
        Aa obj1 = new Aa();
        obj1.showAa();

        Bb obj2 = new Bb();
        obj2.showBb();

        Cc obj3 = new Cc();
        obj3.showCc();
    }
}
