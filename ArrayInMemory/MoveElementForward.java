package ArrayInMemory;

import java.util.Scanner;

public class MoveElementForward {

    public static void main(String[] args) {
        int[] a= new int [40];
        a[0]=9;
        a[1]=4;
        a[2]=91;
        a[3]=19;
        a[4]=92;
        a[5]=99;
        a[6]=94;
        a[7]=49;
        int last=7;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter value ");
        int val = sc.nextInt();
        System.out.println(" Enter position ");
        int ps = sc.nextInt();//3 index will 2 , 2 has 91
        for (int ele: a){
            System.out.print(ele+" ");
        }
        System.out.println();
        if(ps < last+1 && ps >= 0 ) {
            System.out.println(" Invalid position");
        }
        else {
            if (last + 1 < a.length) {

                for (int i = last; i >= ps; i--) {
                    a[i + 1] = a[i];
                }
                a[ps] = val;
                last++;
            } else {
                System.out.println("Invalid Input");
            }
        }
        for (int ele: a){
            System.out.print(ele+" ");
        }

    }
}
