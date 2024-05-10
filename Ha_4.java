class Distance {
    int meters;
    int centimeters;

    // Parameterized constructor
    Distance(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }

    // Display method
    void display() {
        System.out.println("Distance: " + meters + " meters " + centimeters + " centimeters");
    }

    // Method to add two distances
    void sum(Distance d1, Distance d2) {
        int totalMeters = d1.meters + d2.meters;
        int totalCentimeters = d1.centimeters + d2.centimeters;

        if (totalCentimeters >= 100) {
            totalMeters += totalCentimeters / 100;
            totalCentimeters %= 100;
        }

        System.out.println("Sum of distances: " + totalMeters + " meters " + totalCentimeters + " centimeters");
    }
}

public class Ha_4 {
    public static void main(String[] args) {
        // Create Distance objects
        Distance d1 = new Distance(5, 60); // 5 meters and 60 centimeters
        Distance d2 = new Distance(3, 40); // 3 meters and 40 centimeters

        // Display the distances
        System.out.println("Distance 1:");
        d1.display();

        System.out.println("Distance 2:");
        d2.display();

        // Add two distances
        System.out.println("Adding distances:");
        d1.sum(d1, d2);
    }
}

