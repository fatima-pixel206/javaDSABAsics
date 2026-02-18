package ArrayDSA;

import java.util.ArrayList;

import java.util.Collections;

public class SettingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ar= new ArrayList<>();
        ar.add(3);
        ar.add(4);
        ar.add(35);
        ar.add(36);
        ar.add(38);
        System.out.print(ar);
        ar.add(2,200);
        System.out.print(ar);
        ar.remove(4);
        System.out.println();
        System.out.print(ar);
        Collections.reverse(ar);
        System.out.print(ar);
    }
}
