package If_Else.Recursion;

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
