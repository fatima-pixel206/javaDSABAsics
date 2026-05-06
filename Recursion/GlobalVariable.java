package If_Else.Recursion;

public class GlobalVariable {
    //int x =10;
    void change(){
        x= 30;
    }
     void main() {
        fun();
            extra();
         System.out.println(x);
         change();
         System.out.println(x);
         extra();
    }
    void extra(){
        System.out.println(x);// shared
    }
      void  fun(){
        int x =90;
          System.out.println(x);
        }
    static int x =910;
    //x=90
    // it is not possible in class

}
