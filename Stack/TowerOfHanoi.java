package If_Else.Stack;

    import java.util.Stack;
import java.util.Scanner;
    public class TowerOfHanoi {
        // 3 Stacks (Towers)
        static Stack<Integer> towerA = new Stack<>();
        static Stack<Integer> towerB = new Stack<>();
        static Stack<Integer> towerC = new Stack<>();

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // A mein disks dalna (5, 4, 3, 2, 1) - 1 top par hai
            int n= sc.nextInt();
            for (int i = n; i >1 ; i--) {
                towerA.push(i);
            }



            // Move karne ka function
            move(5, towerA, towerC, towerB);

            System.out.println(" final look of Tower C: " + towerC);
        }

        public static void move(int n, Stack<Integer> source, Stack<Integer> destination, Stack<Integer> helper) {
            if (n == 0) return;

            // 1. n-1 disks ko helper pe move karo (using destination as helper)
            move(n - 1, source, helper, destination);

            // 2. Sab se bari disk uthao aur destination pe dalo
            destination.push(source.pop());
            System.out.println("Disk moved to destination!");

            // 3. n-1 disks jo helper pe thin, unhein destination pe le aao
            move(n - 1, helper, destination, source);
        }
    }

