public class endsem1 {
    static int i;
    double d;

}
class check {
    public static void main(String[] args) {
        endsem1 e1 = new endsem1();
        e1.i++;
        e1.d++;
        System.out.println(e1.i);
        System.out.println(e1.d);

        endsem1 e3  = e1; 
        e3.i= e3.i++;
        e3.d = e3.i + e3.d++ +7.325;
        System.out.println(e1.i);
        System.out.println(e1.d);
        System.out.println(e3.i);
        System.out.println(e3.d);
    }
}