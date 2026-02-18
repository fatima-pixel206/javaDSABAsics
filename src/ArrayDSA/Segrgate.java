package ArrayDSA;


public class Segrgate {
    public static void segrgate(int[] arr) {
        int numzero=0;
        int numone=0;
        for (int i : arr) {
            if(i==0){
                numzero++;
            }
            else {
                numone++;
            }
        }
        System.out.println("  zeors: "+numzero);
        System.out.println("  one: "+numone);
        for (int i = 0; i <arr.length ; i++) {
            if(i<numzero){
                arr[i]=0;

            }
            else {

                arr[i]=1;
            }
        }
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");
        }
   }

    public static void main(String[] args) {
        int [] arr={1, 0,1,0,1,0,0};
       // segrgate(arr);

        segregationWithTwoPointers(arr);
        MaximumOfArrayElements.DisplayOfArray(arr);
    }

    public static void segregationWithTwoPointers(int[] ar) {
        int i=0;
        int n=ar.length;
        int j=n-1;
        while(i<j){
            if(ar[i]==0) {
                i++;
            }
           else if(ar[j]==1)
            {
                j--;
            }
          else  if(ar[i]==1 && ar[j]==0){
               ar[i]=0;
               ar[j]=1;
                i++;
                j--;
            }
           //i++;
          //  j--;
        }

    }
}
