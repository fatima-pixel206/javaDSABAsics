package If_Else.BasicOfDSA.IntermediateTask;

public class ReverseArray {
    public void reverse(int []ar){
        int temp;
        for (int i = 0,j=ar.length-1; i < j; i++) {
            temp= ar[i];
            ar[i]= ar[j];
            ar[j]= temp;
            j--;
        }
        for(int e : ar){
            System.out.print(e+" ");
        }
    }

    static void main(String[] args) {
        ReverseArray re= new ReverseArray();
        re.reverse(new int [] {2,3,5,6,7,8});
    }
}
