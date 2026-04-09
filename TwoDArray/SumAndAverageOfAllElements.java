package If_Else.TwoDArray;

public class SumAndAverageOfAllElements {
    public void sumAndAvg(int[][]ar){
        long sum =0;
        long avg = 0;
        int total=0;
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                sum=sum+ar[i][j];
                total++;
            }
        }
        avg = sum/total;
        System.out.println(total);
        System.out.println("sum "+sum);
        System.out.println("Average "+avg);
    }

    static void main() {
        SumAndAverageOfAllElements sumAvg= new SumAndAverageOfAllElements();
        int [][] ar={
                {1,2,3},{4,5,6,7},{8,9,7,6}
        };
        sumAvg.sumAndAvg(ar);
    }
}
