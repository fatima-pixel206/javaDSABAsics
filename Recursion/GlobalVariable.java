package If_Else.Recursion;

public class GlobalVariable {
    int x =10;
    void change(){
        x= 30;
    }
     void main() {
            extra();
         System.out.println(x);
         change();
         System.out.println(x);
         extra();
    }
    void extra(){
        System.out.println(x);// shared
    }
}
