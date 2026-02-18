package ArrayDSA;
import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=MaximumOfArrayElements.inputOfArray();
        System.out.println(" Enter number for search ");
        int num=sc.nextInt();
        int occ=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==num){
                occ++;
               //System.out.println( a[i]+"  is present "+occ +" times in array ");
            }
        }
        if(num==0){
            System.out.println( num+ " not exist in array ");
        }
        else {
            System.out.println(num + "  is present " + occ + " times in array ");
        }
        MaximumOfArrayElements.DisplayOfArray(a);
    }
}
