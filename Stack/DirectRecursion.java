package If_Else.Stack;

public class DirectRecursion {


        static int calculate(int n)
        {
            if(n==0)
            {
                return 0;
            }
            else
            {
                return n + calculate(n-1);
            }
        }

        public static void main(String args[])
        {
            int num = 3;

            int result = calculate(num);

            System.out.println("Result is: "+result);
        }
    }

