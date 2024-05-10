interface DetailInfo {
    void display();
    int count();
}

class Person implements DetailInfo {
    private String name;
    private static int maxCount = 0;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Character count: " + count());
    }

    @Override
    public int count() {
        int charCount = name.length();
        if (charCount > maxCount) {
            maxCount = charCount;
        }
        return charCount;
    }

    public static int getMaxCount() {
        return maxCount;
    }
}

public class q7{
    public static void main(String[] args) {
        Person p1 = new Person("Ankit");
        Person p2 = new Person("poe");

        p1.display();
        p2.display();

        System.out.println("Maximum character count among all persons: " + Person.getMaxCount());
    }
}
