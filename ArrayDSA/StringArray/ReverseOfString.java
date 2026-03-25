package If_Else.ArrayDSA.StringArray;

public class ReverseOfString
 {
    public static String reverseString(String str) {
        //String rev = "";
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i>=0 ; i--) {
            //rev=rev+str.charAt(i);//this method is slow and space taking
            result.append(str.charAt(i));
        }
        // return rev;
        return result.toString();
    }

    static void main() {
        System.out.println(reverseString("Hello"));
    }
}
