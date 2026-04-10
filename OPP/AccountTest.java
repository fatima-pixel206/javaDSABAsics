package If_Else.OPP;

public class AccountTest {
    static void main() {


        Account acc = new Account();
        Account acc2 = new Account();
        System.out.println(acc.getName());
        System.out.println(acc2.getName());
       // System.out.println(acc.hashCode());
       // System.out.println(acc2.hashCode());

        acc2.setName("Fatima");
      // acc2.name= "fatima";
     //   acc.setName(acc2.getName());
        //acc.setName(acc2.getName());
        acc.setName("Ali");
        System.out.println(acc2.getName());
        System.out.println(acc.getName());
    }
}
