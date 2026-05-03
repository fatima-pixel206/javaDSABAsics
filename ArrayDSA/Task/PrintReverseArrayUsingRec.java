package If_Else.ArrayDSA.Task;

public class PrintReverseArrayUsingRec {
    public static void rec(int[] a,int i)
    {
        if(i == a.length-1) return;
      i++;
        rec(a,i);
        System.out.print(a[i]+" ");

    }

    static void main() {
        int [] a = new int[4];
        a[0]=901; a[1]=902; a[2]=903; a[3]=904;
        rec(a,-1);
    }
}
