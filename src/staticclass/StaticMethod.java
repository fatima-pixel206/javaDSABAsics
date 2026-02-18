package staticclass;

 class pap {
    static void pop(){
        System.out.println(" lets print pop ");
    }

}
public class StaticMethod extends pap{
   //  @Override
    static   void poo(){
            System.out.println(" print something else");
        }
// static method can not be override

 public static void main(String[] args) {
     pap p=new pap();
     p.pop();
     pap.pop();
     StaticMethod st = new StaticMethod();
     st.pop();
     StaticMethod.pop();
     st.poo();
 }
}
