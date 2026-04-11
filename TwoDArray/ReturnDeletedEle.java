package If_Else.TwoDArray;



    public class ReturnDeletedEle {
        // first we should find no of occ
        public int noOfOCC(int[][]ar,int delete){
            int occ=0;
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j <ar[i].length ; j++) {
                    if(ar[i][j]== delete){
                        occ++;
                    }
                }
            }
            return occ;
        }
        // now delete the no
        public int[][] deleted(int[][]ar, int delete) {

            int[][] arr2= new int[ar.length][];
            for (int i = 0; i <ar.length ; i++) {
                // check occ in single array
                int occ=0;
                for(int oc: ar[i]){
                    if(oc==delete){
                        occ++;
                    }
                }
                // define size
                arr2[i]= new int[ar[i].length-occ];
                for (int j = 0,y=0; j <ar[i].length ; j++) {
                    if(ar[i][j]!=delete){
                        arr2[i][y]=ar[i][j];
                        y++;
                    }
                }
            }
            OperationsOnTwoDArray.read(arr2);

            return arr2;
        }
        static void main() {
            int [][] ar={
                    {1,2,3},{4,5,6},{8,9,2}
            };

            OperationsOnTwoDArray.read(ar);
            If_Else.TwoDArray.ReturnAfterDeletedEle dp = new If_Else.TwoDArray.ReturnAfterDeletedEle();
            //System.out.println( dp.noOfOCC(ar,2));
            System.out.println();
            dp.deleted(ar,2);
            OperationsOnTwoDArray.read(ar);

        }
    }


