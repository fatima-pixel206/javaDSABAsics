package If_Else.BasicOfDSA.IntermediateTask;

public class SecondLargestEle {
    public void secondLargest(int[] ar){
        int largest = ar[0];
        int secondLar= ar[0];
        // find largest
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]> largest){
                largest=ar[i];
            }
        }
        // find second largest
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]> secondLar && ar[i] < largest){
                secondLar= ar[i];
            }
        }
        System.out.println("Largest ele "+ largest);
        System.out.println(" Second Largest ele "+ secondLar);
    }

     public static void main(String[] args) {
        SecondLargestEle sl= new SecondLargestEle();
        sl.secondLargest(new int[]{3,8,4,12,13,90,90,91});
    }
}
