public class Address {
    String house_no, road_no, city, state;

    public Address(String house_no, String road_no, String city, String state) {
        this.house_no = house_no;
        this.road_no = road_no;
        this.city = city;
        this.state = state;
    }

    public void display() {
        System.out.println("Address: " + house_no + ", " + road_no + ", " + city + ", " + state);
    }
}
