package If_Else.OPP;

public class UserDefineReturnType {
    public void display(Account a){

        System.out.println(a.getName());
        System.out.println();

    }

    static void main() {
        UserDefineReturnType user = new UserDefineReturnType();
        Account a = new Account();
        a.setName("Fatima");
        a.setAge(20);
        a.setCash(0.0);
         user.display(a);
    }
}
