import java.util.*;
 interface shape{
    double area();

    double perimeter();

}
public class Circle implements shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;

    }
    @Override
    public double area(){
        return Math.PI*(radius*radius);
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }

}
class  test4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle(9);
         c1.area();
     c1.primeter();

    }
}
