package staticclass;

import org.w3c.dom.ls.LSOutput;

class Outter {

    static class Inner{
        void show(){
            System.out.println(" print inner class static ");
        }


    }

}
public class StaticClass{
    public static void main(String[] args) {
        Outter.Inner out= new Outter.Inner();
        out.show();
        Outter.Inner in = new Outter.Inner();
        in.show();
        System.out.println(out==in);
        Singleton1 s1=Singleton1.getInstance();
    }
}

