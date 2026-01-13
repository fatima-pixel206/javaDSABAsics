package ArrayDSA;

import java.util.Scanner;

public class EvenElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of array ");
        int s = sc.nextInt();
        int[] ary= new int[s];
        for (int i = 0; i<s ; i++) {
            //System.out.println(" Enter Elements of array :"+i );
            ary[i]= sc.nextInt();
        }
        for (int i = 0; i <s ; i++) {
            if(ary[i]%2==0){
                System.out.print(ary[i]+" ");
            }
        }
    }
}
