package ArrayInMemory;
//Date : 18,feb,2026
public class ArrayOfVariable {
    public static void main(String[] args) {
    int a=5;
    int b=6;
    int c=7;
    int d=8;
    int [] ar={a,b,c,d};
    a=90;
        for (int j : ar) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(ar[0]);
        ar[0]=90;// the variable reference is not stored in array
        // the value is copied and stored
        // if you update value of variable or in array from any index
        System.out.println(a);
}
}