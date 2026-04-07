package If_Else.Buble_Selection_Insertion_Sorting;
//time complexity is O(n*n)
public class Bubble_Sort {
    public void bubbleSort(int[]ar){
        int n=ar.length;
        for (int i = 0; i < ar.length-1 ; i++) {
            for (int j = 0; j < n-1; j++) {


                if (ar[j] > ar[j + 1]) {

                    int temp=ar[j];
                    ar[j] = ar[j + 1];
                    ar[j+1]=temp;

                }
            }
        }

    }
    public static void print(int[]ar){
        for(int ele: ar){
            System.out.print(ele+" ");
        }
    }
    void main(){
        int []letsSort =  {3,4,6,7,5,4,8,3,1};
        print(letsSort);
        bubbleSort(letsSort);
        System.out.println();
        print(letsSort);

    }
}
