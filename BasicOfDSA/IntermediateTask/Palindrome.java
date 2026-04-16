package If_Else.BasicOfDSA.IntermediateTask;

public class Palindrome {

    public  static int palindrome(int n){

        boolean isNeg= false;
        if(n<-1){
            n=Math.abs(n);
            isNeg=true;
        }
        int rev= 0;
        while(n>0){
            int ls=n%10;
            rev= rev*10+ls;
            n=n/10;
        }
        if(isNeg)
        {
            rev=-rev;
        }
      //  System.out.println(rev);
        return rev;
    }


    static void main() {
        int n=-101;
        int rev= palindrome(n);
        System.out.println(rev);
        if(n==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
