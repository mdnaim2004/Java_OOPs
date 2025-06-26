public class Circle extends Shape {
    double redious;
    
    Circle(double redious){
        this.redious = redious;

        double calculateArea(){
            return 3.14159*redious*redious;
        }
    }
}
