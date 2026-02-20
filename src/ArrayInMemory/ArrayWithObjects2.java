package ArrayInMemory;

public class ArrayWithObjects2 {
    int a=89;
    int b=90;
    int c=90;
    int d=89;
    int e=90;
    int f=89;
    void print(){
        System.out.println("second object");
    }

    public static void main(String[] args) {
        ArrayWithObjects2 a=new ArrayWithObjects2();
        System.out.println(a.b);
        // this will print the value it has in this class
    }

}
