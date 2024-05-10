

class PointType {
     double x;
     double y;

    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void printCoordinates() {
        System.out.println("(" + x + ", " + y + ")");
    }


}

class CircleType extends PointType {
   double radius;

    public CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }



    public void printRadius() {
        System.out.println("Radius: " + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class ha_5 {
    public static void main(String[] args) {
        CircleType circle = new CircleType(1, 2, 5);
        circle.printCoordinates(); // Prints center coordinates
        circle.printRadius();      // Prints radius
        System.out.println("Area: " + circle.getArea());  // Prints area
        System.out.println("Circumference: " + circle.getCircumference());  // Prints circumference
    }
}

