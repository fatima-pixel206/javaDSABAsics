package If_Else.Stack;

import java.util.Vector;

public class VectorTest {
    static void main() {
        Vector<Integer> vec = new Vector<>(6,2);

        vec.add(4);
        vec.add(4);
        vec.add(4);
        vec.add(4);
        vec.add(4);
        System.out.println(vec.size());
        System.out.println(vec.capacity());
    }
}
