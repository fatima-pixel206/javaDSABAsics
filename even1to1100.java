package ForLoopDSA;

public class even1to1100 {
    public static void main(String[] args) {
        int i;
        int odd=1;
        int even=0;
        for(i=0; i<=50;i++){
//
//          if((i % 2) == 0){
//              //System.out.println( i );
//
//          }
            even = even+2;
          odd=odd+2;
            System.out.print(odd+" ");
            System.out.println( even+" ");
        }
    }
}
