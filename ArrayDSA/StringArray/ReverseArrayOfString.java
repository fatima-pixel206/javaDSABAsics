package If_Else.ArrayDSA.StringArray;


public class ReverseArrayOfString {
    public static void reverse(String[] ars) {
        String swap="";

        for (int i = 0,j=ars.length-1;  i < j ; i++) {

            swap = ars[i];
            ars[i] = ars[j];
            ars[j] = swap;
            j--;
        }
    }

    static void main() {
        String [] ars=new String[5];
        ars[0]="abc";
        ars[1]="def";
        ars[2]="ghi";
        ars[3]="jkl";
        reverse(ars);
        for (int a = 0; a <ars.length ; a++) {
            System.out.print(ars[a]+" ");
        }
    }
}
