package If_Else.ArrayDSA.StringArray;

public class ShapePattern {
    public static void main(String[] args) {
        char[][] grid = {
                {'0','X','O'},
                {'X','O','X'},
                {'O','X','?'}
        };

        // Missing shape
        char missing = 'O';

        // Display grid
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Correct Answer: " + missing);
    }
}
