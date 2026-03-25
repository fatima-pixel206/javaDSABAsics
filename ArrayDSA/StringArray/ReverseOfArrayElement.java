package If_Else.ArrayDSA.StringArray;

public class ReverseOfArrayElement {

    public static void reversIn(String[] as) {
        StringBuilder sb = new StringBuilder();
        String rev="";
        for (int i = 0,j=as.length-1; i <as.length/2 ; i++) {

            for (int k = as[i].length() - 1; k >= 0; k--) {
                sb.append(as[i].charAt(k));

//                rev = as[i];
//                as[i] = as[j];
//                as[j] = rev;

            }
            j--;

        }

        for (int i = 0; i <as.length ; i++) {
            System.out.print(as[i]+" ");
        }
    }

    static void main() {
        String[] ars=new String[5];
        ars[0]="abc";
        ars[1]="def";
        ars[2]="ghi";
        ars[3]="jkl";
        ars[4]="mno";
        reversIn(ars);

    }
}
