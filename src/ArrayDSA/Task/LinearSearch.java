package ArrayDSA.Task;

import java.util.Scanner;

public class LinearSearch {
    static void main() {
        String []name={"Fatima","Ali","Hadi","Shani"};
        System.out.println("Enter Name you want to search:");
        Scanner sc = new Scanner(System.in);
        String nameS=sc.nextLine();
        for (int i = 0; i < name.length; i++) {
            if(name[i].equalsIgnoreCase(nameS)){
                System.out.println(name[i]+" is in list \n on number"+i);
                break;
            }

        }

    }
}
