package ArrayDSA;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= MaximumOfArrayElements.inputOfArray();
        System.out.println(" Enter number for search ");
        int num=sc.nextInt();
        boolean flag= false;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==num){
//                flag= true;
//                System.out.println(" number exist in index "+i);
//                break;
//            }
//
//        }
//        if(flag){
//            System.out.println(" number exist");
//        } else {
//            System.out.println(" number  does not exist");
//        }
        int found=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==num){
                found=i;
            }
        }
        if(found!=-1){
            System.out.println(" number exist in index "+ found);
        } else {
            System.out.println(" number  does not exist");
        }
    }
}
