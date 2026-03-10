package Chapter2;

public class Palindrome {
    public static int palindrome(int x) {
        if (x < -1) {
            return x;
        } else {


            int zer = 0;
            while (x > 0) {
                int lastDi = x % 10;
                zer = zer * 10 + lastDi;
               x= x / 10;
            }
    return zer;
        }
       // return false;
    }

    static void main() {
        int x=121;
        System.out.println(palindrome(x));
        int palindrome= palindrome(x);
        if(x==palindrome)
        System.out.println("yes ");
    }
}
