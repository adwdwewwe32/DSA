import java.util.Scanner;

class Book {
    public String BName ;
    public int BEdition;
    public double BPrice;

    // Constructor
    public Book(String BName, int BEdition, double BPrice) {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }

    // Method to display book information
    public void display() {
        System.out.println("Book Name: " + BName);
        System.out.println("Edition: " + BEdition);
        System.out.println("Price: " + BPrice);
    }

    // Getter method for price
    public double getPrice() {
        return BPrice;
    }
}

public class   Ha_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[5];

        // Input book details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Edition: ");
            int edition = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume newline
            books[i] = new Book(name, edition, price);
        }

        // Find book with maximum price
        Book maxPriceBook = books[0];
        for (int i = 1; i < 5; i++) {
            if (books[i].getPrice() > maxPriceBook.getPrice()) {
                maxPriceBook = books[i];
            }
        }

        System.out.println("Book with maximum price:");
        maxPriceBook.display();

    }
}

