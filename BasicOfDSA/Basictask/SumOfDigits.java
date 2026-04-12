package If_Else.BasicOfDSA.Basictask;

public class SumOfDigits {
public  static void sumOfDig(int n){
    int sum=0;
   while(n>0){
       int lastDigit =n%10;

       sum=sum+lastDigit;
       n=n/10;
   }
    System.out.println(sum);
}

    static void main() {
        sumOfDig(12345);
    }

}
