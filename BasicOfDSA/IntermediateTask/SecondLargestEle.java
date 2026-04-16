package If_Else.BasicOfDSA.IntermediateTask;
 public class SecondLargestEle{
     public void second(int[]ar) {
         boolean allElements = true;
         if (ar.length < 2) {
             System.out.println(" Array has only one element ");
             return;
         }
         for (int i = 1; i < ar.length - 1; i++) {
             if (ar[i] != ar[0]) {
                 allElements = false;
                 break;
             }

         }
         if (allElements) {
             System.out.println("All elements are equal");
             return;
         }

         int largest = Integer.MIN_VALUE;
         int secondLar = Integer.MIN_VALUE;
         for (int i = 0; i < ar.length; i++) {

             //secondLar= largest;
             if (ar[i] > largest) {
                 secondLar = largest;
                 largest = ar[i];
//
             }
             else if (ar[i] < largest && ar[i] > secondLar)
                 secondLar = ar[i];

         }


             System.out.println("Largest is "+ largest);
             System.out.println("Second largest is "+secondLar);
             return;
         }



     static void main() {
         SecondLargestEle sl = new SecondLargestEle();
         sl.second(new int[]{1,2,3,});
     }
 }
