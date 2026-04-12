package If_Else.BasicOfDSA.Basictask;

public class PrimeNo {
    public void prime(int n) {
        boolean isPrime= true;
        if(n<=0){
            isPrime=false;
        }
        System.out.println(Math.sqrt(n));
        if(n>1)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0  ) {

        isPrime=false;
        break;
            }
            else {
                isPrime=true;
            }

        }
        if(isPrime){
            System.out.println("Prime no :");
        }
        else {
            System.out.println("Not a prime");
        }
    }

    static void main() {
        PrimeNo p=new PrimeNo();
        p.prime(2);
    }
}
