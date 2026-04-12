package If_Else.BasicOfDSA.Basictask;

public class PrimeNo {
    public void prime(int n) {
        boolean isPrime= true;
        if(n<=1){
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
    // another way
    public void prime2(int n){
        boolean isp= true;
        if(n==2){
            System.out.println(" prime ");
            return;
        }
        if(n<=1){
            System.out.println(" not prime");
            return;
        }

        if(n%2==0){
            System.out.println("not prime");
        }
        // check with odd
        for (int i = 3; i*i <=n ; i+=2) {
            if(n%i==0){
                isp= false;
                break;

            }

        } if(isp){
            System.out.println(" prime ..");
        }
        else
        {
            System.out.println(" not prime ");
        }
    }

    static void main() {
        PrimeNo p=new PrimeNo();
        //p.prime(2);
        p.prime2(2);
    }
}
