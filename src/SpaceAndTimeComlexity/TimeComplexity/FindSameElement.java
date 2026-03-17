package SpaceAndTimeComlexity.TimeComplexity;
/*
array length is n and
elements are n-1
it means if length is 6 numbers are 1 to 5
one elements is repeated find that number

 */
public class FindSameElement {
    // approach 2
    public static void findELe(int[] ar) {
        int n=ar.length;
        boolean []flag= new boolean[n+1];
        for (int i = 0; i <n ; i++) {
            int ele=ar[i];
            if (flag[ele]==true) {
                System.out.println(ele);
            } else
            {
                flag[ele]=true;
            }
// ? number of op are 6 but taking more space taking
        }

    }
    // approch 1
    // no of operations are 14 in inner loop and 6 outer loop
    public static void duplicate(int[]ar){
        for (int i = 0; i <ar.length ; i++) {
            for (int  j=i+1 ; j < ar.length; j++) {
                if(ar[i]==ar[j]){
                    System.out.println(ar[i]+" duplicate");
                    break;
                }
            }

        }
    }


    //

    // third a smart method
    // total no of op are 6 and not more space taking
    public static void sameEle(int[] arr){
         long n=arr.length;// because length is n+1 one number is twice in array
        // and one is missing
            int sum=0;
            long num = n-1;
        for (int i = 0; i < arr.length; i++) {
        sum=sum+arr[i];

        }
            long dup = num*n/2;
        // take number and n+1 divide by 2
        System.out.println("duplicate is "+(sum-dup));
    }


    public static void main(String[] args) {
        int[] ar={10,9,8,7,6,7,3,2,1,5,4};
       findELe(ar);
        duplicate(ar);
        sameEle(ar);
    }
}

