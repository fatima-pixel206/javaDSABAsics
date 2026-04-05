package If_Else.Stack;


 public class IndirectRecursion {

    static int num = 1;

    static void showOdd()
    {
        if(num<=10)
        {
            System.out.println("Odd: "+num);
            num++;
            showEven();
        }
    }

    static void showEven()
    {
        if(num<=10)
        {
            System.out.println("Even: "+num);
            num++;
            showOdd();
        }
    }

    public static void main(String args[])
    {
        showOdd();
    }
}
