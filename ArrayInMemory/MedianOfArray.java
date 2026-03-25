package If_Else.ArrayInMemory;

import java.util.Arrays;



    public class MedianOfArray {
        public static void findMedian(int[] arr) {
            Arrays.sort(arr);
            int n = arr.length;
            if(n % 2 ==1){
                System.out.println(arr[n/2]+" is median");
            }
            else {
                double mid1=arr[n/2];
                double mid2=arr[n/2-1];
                double median=(mid1+mid2)/2.0;
                System.out.println(median+" is median");
            }

        }
        public static void main(String[] args) {
            findMedian(new int[]{9,1,2,3,4,5,5});

        }
    }


