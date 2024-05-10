public class geeen <T extends Number> {
        T[] num;
         geeen(T[] num){
        this.num = num;


       }
         public double findsum(){
              double sum =0;
              for (int i = 0; i < num.length; i++) {
                     sum = sum + num[i].doubleValue();

              }
              return sum;
          
         }


          boolean equalSum(geeen<?> obj){
              if (findsum() == obj.findsum()) 
                     return true;       
              

              return false;
             
         }

}

class test{
       public static void main(String[] args) {
              Integer arr[] = {1};
              geeen <Integer> obj = new geeen<>(arr);
              Double darr[] = {1.0};
              geeen <Double> obj2 = new geeen<>(darr);
               double temp1 = obj.findsum();
               double  temp2 = obj2.findsum();
               System.out.println(temp1);
               System.out.println(temp2);

               if (obj.equalSum(obj2)) {
                     System.out.println("same");
                     
               }
               else{
                     System.out.println("different");
               }
       }


}
