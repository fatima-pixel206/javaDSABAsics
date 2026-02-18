package SpaceAndTimeComlexity;

public class Sort012 {

        public void sort012(int[] arr) {
            int low=0;int mid=0;int high=arr.length-1;
            while(mid<=high){
                if(arr[mid]==0){
                    swap(arr,low,mid);
                    mid++;
                    low++;


                }
                else if(arr[mid]==1){
                    mid++;

                }
                else{
                    swap(arr,mid,high);
                    high--;
                }
            }
        }
        public static void swap(int[] ar,int i,int j){
            int swp= ar[i];
            ar[i]=ar[j];
            ar[j]=swp;
        }

    }


