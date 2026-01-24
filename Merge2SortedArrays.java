package ArrayDSA.Arraylist;

public class Merge2SortedArrays {
    public static void Merge(int[]ara,int[]b,int[]c) {
        int i = 0;
        int j = 0;
        int k=0;

        while (i < ara.length && j < b.length) {

            if (ara[i] <= b[j]) {
               c[k]=ara[i];
               i++;

                }
            else{
                c[k]=b[j];
                j++;

            }
            k++;
        }
            while (j<b.length){
                c[k++]=b[j++];
            }
            while (i< ara.length){
                c[k++]=ara[i++];

        }
for(int ele : c ){
    System.out.print(ele+" ");
}
    }
    public static void main(String[] args) {
        int[] a={1,2,4,6,7,8,9};
        int []b={ 3,5,6,10,12,80};
        int []c=new int[a.length+b.length];
        Merge(a,b,c);
    }
}
