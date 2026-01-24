package ArrayDSA.Arraylist;
import java.util.ArrayList;
public class ReversearrayList {

    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>();
        array.add(4);
        array.add(6);
        array.add(7);
        array.add(9);
        array.add(6);
        array.add(46);
        array.add(22);
        array.add(4);
        array.add(33);
        array.add(97);
        System.out.print(array+" ");
        System.out.println();
        int i=0;
        int j=array.size()-1;
        while(i<j){
            int swap= array.get(i);
            array.set(i,array.get(j));
            array.set(j,swap);
            i++;
            j--;
        }
        System.out.print(array+" ");
    }}
