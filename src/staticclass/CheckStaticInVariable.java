package staticclass;

public class CheckStaticInVariable {

        static int num=80;
        static String name=" fati ";

//    num=20;
//    name=" hmmmm ";
//    this is not allowd in static

    //hence you can't update static variable value but you can do this with construdtor or getter setter

    public static void Print() {
        System.out.println(" Name : "+ name+"\n "+" num :"+ num);
    }

}
// lets check to extends


