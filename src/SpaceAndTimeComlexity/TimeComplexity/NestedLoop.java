package SpaceAndTimeComlexity.TimeComplexity;
/*
Dated 16 march
the time complexity of this nested loop is m*n
if m=6 and n=5
6*5 time this loop will run

 */
public class NestedLoop {
    public static void nest(int m,int n) {
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("java");
            }
            System.out.println();
        }
    }
}
