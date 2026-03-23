package SpaceAndTimeComlexity.TimeComplexity;

import java.util.ArrayList;
/*
Dated 19 March 2026
 */
public class LinearSearchBestCase {
    public static void linearSearch(int[] arr, int key) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==key){
                System.out.println(arr[i]+" is present in array");
                break;
            }
            else if(arr[j]==key){
                System.out.println(arr[j]+" is present in array ..");
                break;
            }

                i++;
            j--;

        }
        // return 0;

    }
/*
 here the time com is half of the n
  O(n/2)=  O(n)
 */
    static void main() {
        int[] arr= {2,4,5,6,7,8,91,0};
        //System.out.println(arr.length);
        int n=91;
        linearSearch(arr,n);
    }
}
