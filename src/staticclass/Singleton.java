package staticclass;

 class Singleton1 {
     private static Singleton1 obj;
     // private object
     //private consturctor
     private Singleton1(){

     }
     public static Singleton1 getInstance(){
         if(obj==null){
             obj= new Singleton1();
             System.out.println(" yes just once");
         }
         return obj;
     }
     // note the class name is a return type

     void  show(){
         System.out.println(" print something");
     }
     public static void Print(){
         System.out.println(" this will make only one object");
     }


}
public class Singleton {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1.Print();
     s1.show();
        Singleton1 s2 = Singleton1.getInstance();
            s2.show();
            check();
        Singleton1 s3= Singleton1.getInstance();
        s3.show();
        Singleton1.Print();
        System.out.println(s1==s2 && s3==s1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
   static void check(){
        Singleton1 s3= Singleton1.getInstance();
        s3.show();
        Singleton1.Print();
       System.out.println(s3.hashCode());

       System.out.println(s3);
    }

}
