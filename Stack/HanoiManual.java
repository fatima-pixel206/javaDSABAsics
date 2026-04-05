package If_Else.Stack;


    public class HanoiManual {
        // Teen Manual Stacks banaye
        static MyStack A = new MyStack();
        static MyStack B = new MyStack();
        static MyStack C = new MyStack();

        public static void main(String[] args) {
            int n = 3;
            // Tower A mein disks bharna (3, 2, 1)
            for (int i = n; i >= 1; i--) {
                A.push(i);
            }

            // Asli Function Call
            solve(n, A, C, B, 'A', 'C', 'B');
        }

        public static void solve(int n, MyStack src, MyStack dest, MyStack help, char sName, char dName, char hName) {
            if (n == 0) return;

            // 1. n-1 disks ko helper pe bhejo
            solve(n - 1, src, help, dest, sName, hName, dName);

            // 2. YAHAN HO RAHA HAI ASLI MOVE!
            int disk = src.pop(); // Source se nikala
            dest.push(disk);      // Destination mein dala
            System.out.println("Move disk " + disk + " from " + sName + " to " + dName);


            // 3. n-1 disks ko helper se destination pe le aao
            solve(n - 1, help, dest, src, hName, dName, sName);
        }
    }

