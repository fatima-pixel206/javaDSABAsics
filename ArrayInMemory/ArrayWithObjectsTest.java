package ArrayInMemory;

public class ArrayWithObjectsTest {
    public static void main(String[] args) {
        ArrayWithObjects a = new ArrayWithObjects();
        ArrayWithObjects2 b = new ArrayWithObjects2();
        ArrayWithObjects[] arr = new ArrayWithObjects[3];
        arr[0]=a;

System.out.println(b);
        System.out.println(b.f);
        b.f=900;
        arr[0]=a;
      //  arr[1]=b;
    System.out.println(arr[0]);
// so here in index [0] has not the value of (a) but, it has the reference or address
        //
        ArrayWithObjects2 []ar={b,};
        //ar[0]=b;
        // arr[1]=a;
        // this will exception
        System.out.println(ar[0]);// address
        System.out.println(ar[0].b);
        // the same value the class have
        ar[0].b=78;
        // this is assigning value in    ArrayWithObjects2 in int b

        System.out.println(ar[0].b);
        System.out.println(ar[0].a);
        System.out.println(ar.length);
        if(b==ar[0]){
            System.out.println("true");
        }

        System.out.println(ar[0].hashCode()==b.hashCode());
        // so this is proved the address of refence is same in array's memory
        // array memory starts from refence memory in contineous from
        // length of array is one because it has one index and that is refence
        // the value of the object is also in contineous from in heap memory
        // and these all values are ob obj
        // ================
        //++++_______________-___--_--------
        System.out.println(ar[0].f);
        ar[0].f=909;
        System.out.println(b.f);
        // so here we can change the value of the variable unlike array of variable
        // here you can see with using of object b the value in array is also changing

        // and updating array index is updating is also changing in object filed
        ar[0].print();
    }
}

