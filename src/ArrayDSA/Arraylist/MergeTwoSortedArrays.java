package ArrayDSA.Arraylist;

public class MergeTwoSortedArrays {
    public static void merge(int[]c,int[]a,int []b) {
        int i=a.length-1;
        int j=b.length-1;
        int k=c.length-1;
        while(i>=0 && j>=0){
            if(a[i] >= b[j]){
                c[k--]=a[i--];
            }
            else{
                c[k--]=b[j--];
            }
        }
        while(i>0){
            c[k--]=a[i--];
        }
        while(j>0){
            c[k--]=b[j--];
        }
        for(int ele: c){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,4,6,7,8,9};
        int []b={ 3,5,10,12};
        int []c=new int[a.length+b.length];
        merge(c,a,b);
    }
}
