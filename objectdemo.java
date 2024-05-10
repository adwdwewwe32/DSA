public class objectdemo {
    int num;

    public objectdemo(int num){
        this.num = num;
    }

    @Override
    public int hashCode(){
        return num;
    }

    public static void main(String[] args) {
        objectdemo a = new objectdemo(77) ;
        int hashCode = a.hashCode(); // Calling the hashCode() method
        System.out.println("Hash Code: " + hashCode);
    }
}
