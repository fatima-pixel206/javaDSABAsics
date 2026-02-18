package ArrayDSA.OtherDatTypesOfArray;

public class ChangeValue {
    public static void change(int[] args) {
         args[4]= 99;
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] x={3,6,7,8,9,4,22,4,5,};
        System.out.println(x[4]);
        change(x);
        System.out.println(x[4]);
    }
}
