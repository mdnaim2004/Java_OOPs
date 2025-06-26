abstract class Ve {
    abstract void start();
}
 class Car extends Ve {

    void start(){
        System.out.println("start with key");
    }
}
class Honda extends Ve{
    void start(){
        System.out.println("start with kick");
    }
    
    public static void main(String[] args) {
      // Ve v = new Ve();
      // v.start();
        Car c = new Car();
        c.start();

        Honda h = new Honda();
        h.start();
    }
}