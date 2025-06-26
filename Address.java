public class Address{
    String city, state, house_no, road_no;

    public Address(String state, String city, String road_no, String house_no){
        this.state = state;
        this.city = city;
        this.road_no = road_no;
        this.house_no = house_no;
    }

    public void showInfo(){
        System.out.println("Address     : " +house_no +","+road_no+","+city+","+state);
    }
}