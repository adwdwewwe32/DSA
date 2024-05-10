import java.util.Scanner;

class Commission {
    private double sales;

    // Constructor
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate commission
    public double getCommission() {
        if (sales < 0) {
            return -1; // indicating invalid input
        } else if (sales <= 100) {
            return sales * 0.02;
        } else if (sales <= 5000) {
            return sales * 0.05;
        } else {
            return sales * 0.08;
        }
    }
}

public class HA_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sales amount: ");
        double sales = sc.nextDouble();

        Commission commissionObj = new Commission(sales);
        double commissionAmount = commissionObj.getCommission();

        if (commissionAmount == -1) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Commission: Rs. " + commissionAmount);
        }

      
    }
}

