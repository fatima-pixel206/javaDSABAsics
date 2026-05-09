package If_Else.Recursion;
// this is not about print even odd number by checking this is simply print number a sequunce
// also understand it as printing even od in seqeunce
public class recusrsiveEvenOdd {
    int n=1;
      void odd(int n){
          if(n>10) return;

             System.out.println(n);

         even(n+1);
     }
     void even(int n){
          if(n>10) return;

         System.out.println(n);
          odd(n+1);
     }

     void main() {
        even(n);
    }
}
