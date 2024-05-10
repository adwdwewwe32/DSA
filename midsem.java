// //  interface midsem {

//     int a;
//     void print(){
//         System.out.println("hello");
//     }
// }
// class test{
//     public static void main(String[] args) {
//         midsem m1  = new midsem();
//         System.out.println(m1.a);
            
//         System.out.println(m1.print());
//     }
// }
interface midsem {
    int a = 5; // Constant variables are allowed in interfaces

    void print(); // Method declaration without implementation
}

class MyClass implements midsem {
    @Override
    public void print() {
        System.out.println("hello");
    }
}

class test {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(); // Instantiate the class that implements the interface
        System.out.println(midsem.a); // Access the constant variable through the interface

        m1.print(); // Call the method implemented in the class
    }
}
