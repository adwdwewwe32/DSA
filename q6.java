abstract class Marks {
    protected int markICP;
    protected int markDSA;
    protected double percentage;

    public abstract void getPercentage();
}

class CSE extends Marks {
    private int algoDesign;

    public CSE(int markICP, int markDSA, int algoDesign) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }

    @Override
    public void getPercentage() {
        percentage = ((markICP + markDSA + algoDesign) / 3.0);
        System.out.println("Percentage for CSE student: " + percentage);
    }
}

class NonCSE extends Marks {
    private int enggMechanics;

    public NonCSE(int markICP, int markDSA, int enggMechanics) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }

    @Override
    public void getPercentage() {
        percentage = ((markICP + markDSA + enggMechanics) / 3.0);
        System.out.println("Percentage for Non-CSE student: " + percentage);
    }
}

public class q6 {
    public static void main(String[] args) {
        // Example usage
        CSE cseStudent = new CSE(80, 85, 90);
        cseStudent.getPercentage();

        NonCSE nonCSEStudent = new NonCSE(70, 75, 85);
        nonCSEStudent.getPercentage();
    }
}
