package If_Else.OPP;

public class UserDefineReturnType {
    public void display(Account a){

        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getCash());

    }

    static void main() {
        UserDefineReturnType user = new UserDefineReturnType();
        Account a = new Account();
        a.setName("Fatimaa");
        a.setAge(20);
        a.setCash(0.0);
         //user.display(a);
         Account b= new Account();
        b.setName("Ali");
        b.setAge(20);
        b.setCash(80.0);
       // user.display(b);
              Account d = user.getRef(b).setName("AAli");
//        System.out.println(b.getCash());
//        System.out.println(d.getCash());
//        d.setCash(1.0);
//        System.out.println(d.getCash());
//       // b.setCash(2.0);
//        System.out.println(b.getCash());
        System.out.println(a);
        System.out.println(b);
       Account winner=user.checkPara(a,b);
        System.out.println(" Winner is "+winner.getName()+" Cash " +winner.getCash());
    }
    public Account getRef(Account a){
        return a;
    }
    public Account checkPara(Account a,Account b){
        if(a.getCash()> b.getCash())
            return a;
        else
            return b;
    }

}
