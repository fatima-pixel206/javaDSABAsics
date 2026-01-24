package ArrayDSA.Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChek {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(4);
        arr.add(67);
        arr.add(690);
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
       // System.out.println(arr.get(3));
        System.out.println(arr.size());
       arr.set(2,89);
        System.out.println(arr.get(2));
        System.out.println(arr);
        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<20;i++){
//            System.out.println(" enter values ");
//
//            i=sc.nextInt();
//            ((ArrayList<Integer>) arr).add(i);
//        }
        System.out.println(arr);
        System.out.println(arr.size());
        int n=arr.size();

        for (int i = 0; i <n ; i++) {
            System.out.print(arr+" ");

        }
int s=arr.size();
        for (int i=0; i<n;i++){
            System.out.print(arr.get(i)+" ");

        }
        for(int ele: arr){
            System.out.println(ele+" ");
        }
    }
}
