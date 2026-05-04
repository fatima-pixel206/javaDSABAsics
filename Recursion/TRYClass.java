package If_Else.Recursion;

public class TRYClass {
    static void main() {
        all(1);
    }
  static   void all(int n){
        if(n== 10) return;
        System.out.println("hi"+n);
        all(n+1);
      System.out.println(n+1);
    }
}
