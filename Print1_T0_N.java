package If_Else;

public class Print1_T0_N {

     void printseq(int x,int y){
         if(x>y) return;
         System.out.print(x+" ");
         printseq(x+1,y);
     }

     void main() {
        printseq(1,8);
    }
}
