package ArrayInMemory;

public class MultipleClasses {
    // attributes
   int v1=89;
   int v2=90;
   int v3=91;
    String cla=" This is class One ";
// method one
 public   void showClassOne()
   {
//       System.out.println(v1);//89
//       System.out.println(v2);//90
//       System.out.println(v3);//91
       System.out.println(cla);
   }
   // method two
public void sum(int a,int b,int c)
{
    int sum=a+b+c;
    System.out.println(sum);//270
    System.out.println(cla);// " This is class One ";
}

}// end class MultipleClasses

// class 2
class MultipleClassOne extends MultipleClasses{
    // its own fields
    String name= " Fatima ";
    double salary = 0.00000;
    String cla1=" This is class Two ";
    int v1=890;
void accessFields(){
    System.out.println(v1);// 890
    System.out.println(super.v1);// 89 parent's class
}


    // override  method sum
    @Override
   public void sum(int a,int b,int c){

        int sum=a + b+c  ;
        // here v1 is 890 meanwhile v2 ans v3 are parent's class

        System.out.println(" sum is:"+sum);// sum will be 1071
        System.out.println(cla1);
    }

    // override  method two
    @Override

        public void showClassOne(){
        System.out.println(" Show class two ...");
//        System.out.println(super.v1+ " Parent's");
//        System.out.println(v1+" child ");
//        System.out.println(super.v2);
//        System.out.println(super.v3);
    }
}
// class 3
class MultipleClassTwo extends MultipleClasses {
    @Override
    public void sum(int a, int b, int c) {

        System.out.println(" sum is:" + (a + b + c) + " class three");
        int v2 = 9090;
        System.out.println(v2+" child");
        System.out.println(super.v2+" parent");
    }

    String cla2 = " This is class three";
    float salary = 0.00000f;
    String name = " Fatima ";
    int age = 20;

@Override
    public void showClassOne(){
    super.v1=75;// child
//    System.out.println(super.v1);// 89
//    System.out.println(v1);//75
//    System.out.println(super.v2);
    System.out.println(cla2);

}
}