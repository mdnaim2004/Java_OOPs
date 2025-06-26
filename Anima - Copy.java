class Anima{
    void show(){
        System.out.println("parent class");
    }
}
    class Male extends Anima{
        void show1(){
            System.out.println("Parents 2");
        }
    }
    class Dog extends Male{
         void show2(){
            System.out.println("child");
         }
    }

    public class Main{
        public static void main(String[] args) {
            Dog obj =new Dog();
            obj.show();
        }
    }
