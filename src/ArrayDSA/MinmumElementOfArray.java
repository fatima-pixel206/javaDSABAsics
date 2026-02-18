package ArrayDSA;

public class MinmumElementOfArray {
    public static int minmun(int[] array){
       // int min = Integer.MIN_VALUE;
        int min = array[0];

        for (int i = 0; i <array.length ; i++) {
            if(array[i] < min ){
                min= array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr= MaximumOfArrayElements.inputOfArray();
        System.out.println( minmun(arr));
        //int [] arri = new int[1000000000];

    }
}
