class Car {
    private int engin_num;

    public void SetEnum(int Engin) {
        engin_num = Engin;
    }

    public int getEnum() {
        return engin_num;
    }
}

class Vehicle1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.SetEnum(1010);
        System.out.println(c.getEnum());
    }
}
