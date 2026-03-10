package Chapter2;

public class StringInMain {
    public static void main(String[] args) {
        System.out.println(args.length);
        args[0]=" Fatima ";
        args[1]=" arain ";
        args[2]="28";
        for (String arg : args) {
            System.out.println(arg);
        }

       // System.out.println(args[0]);
    }
}
