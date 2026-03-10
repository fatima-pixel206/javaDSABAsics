/* Date 11 feb 2026
Author Fatima
*/
package Chapter2;
public class FormateSpecifier {

     public static void main() {
         System.out.printf("%s%n%s%n"," Welcome to ","java programing");
         System.out.printf("%s%s","Welcome to ","HI");
         // printf will not remain empty like print or print ln
         //%s use when there are more than one strings it shows its address
         //printf makes easier to print multiple lines
            int x=2;
            int a=3;
            int y;
            y=a*x*x*x+7;
         System.out.println();
         System.out.println(y);
         y=a*(Math.powExact(x,3))+7;
         System.out.println(y);
    }
}
