package ArrayDSA;

public class RotationFinal {
    public static void rot(int[]ar,int d) {
        int i=0;
 int j=d;
        while(i<j-1){
            int swap=ar[i];
            ar[i]=ar[j];
            ar[j]=swap;
            i++;
            j--;
        }
    }
    public static void rotother(int[]ar,int d) {
int i=d+1;
int j=ar.length-1;
        while(i<j){
            int swap=ar[i];
            ar[i]=ar[j];
            ar[j]=swap;
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        int []ar={3,5,7,8,9,0,2,4,6,88,2};
        MaximumOfArrayElements.DisplayOfArray(ar);
        rot(ar,3);
        MaximumOfArrayElements.DisplayOfArray(ar);
        rotother(ar,3);
        MaximumOfArrayElements.DisplayOfArray(ar);

 ReverseAr.reverse3(ar);

    }
}
