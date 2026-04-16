package If_Else.ArrayInMemory;

public class MoveSpecificElementToRight {
    public void moveToRight(int[] arr,int position , int filledSize,int value) {
        if (position < 0 || position > filledSize) {
            System.out.println("Invalid position");
            return;
        }
        if (filledSize == arr.length - 1) {
            System.out.println(" Array is full ");
            return;
        }
        for (int i = filledSize ; i >= position; i--) {
            arr[i + 1] = arr[i];
            // moving last filled element to right side

        }

        arr[position] = value;
        filledSize++;
        for (int f : arr) {
            System.out.print(f + " ");
        }
    }
    static void main() {
        int [] ar= new int[10];
        int filledSize=0;
        ar[0]=98;
        filledSize++;
        ar[1]=90;
        filledSize++;
        ar[2]=88;
        filledSize++;
        ar[3]=978;
        filledSize++;
        ar[4]=981;
        filledSize++;
        ar[5]=198;
        filledSize++;
        ar[6]=908;
        filledSize++;
        for(int e: ar){
            System.out.print(e+" ");
        }
        int position=5;
        int val= 67;
        // now 978 is on index 3 here we will insert 67
        //98,90,88,978,981,198,908,
        // after insertion it should be 98,90,88,67,978,981,198,908
        MoveSpecificElementToRight mov= new MoveSpecificElementToRight();
        System.out.println();
        mov.moveToRight(ar,position,filledSize,val);

     //   System.out.println(filledSize);

    }
    }

