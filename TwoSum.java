package ArrayDSA;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr=MaximumOfArrayElements.inputOfArray();
        int target=2;
             int ind=-1;
             int indj=-1;
        MaximumOfArrayElements.DisplayOfArray(arr);
        for (int i = 0; i <arr.length ; i++) {

            for (int j = i+1; j <arr.length ; j++) {
                if((arr[i]+arr[j])==target){
                   ind=i;
                   indj=j;
                    System.out.println(" target done with index "+ ind+" and "+indj);
                }
            }
        }
        if(ind==-1 && indj==-1){
            System.out.println(" target can not do");
        }


    }
    boolean targetcheck(int arr[],int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if((arr[i]+arr[j])==target){
                    return true;
                }
            }
        }
        return false;
    }
}
