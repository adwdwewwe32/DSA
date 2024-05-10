import java.util.Scanner;

class Student {
    String name;
    int roll;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter roll number: ");
        roll = sc.nextInt();
    }


    //Display mode
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class Test extends Student {
    int mark1;
    int mark2;

    void inputDetails() {
        super.inputDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark 1: ");
        mark1 = sc.nextInt();
        System.out.println("Enter mark 2: ");
        mark2 = sc.nextInt();
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }

    int calculateTotalMarks() {
        return mark1 + mark2;
    }
}

interface Sports {
    int score1 = 10;
    int score2 = 20;
}

public  class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.inputDetails();
        test.showDetails();

        int totalMarks = test.calculateTotalMarks();
        int totalScore = Sports.score1 + Sports.score2;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total Score: " + totalScore);
    }
}
