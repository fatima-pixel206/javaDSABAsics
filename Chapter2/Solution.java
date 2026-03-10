package Chapter2;
class Person {


    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    // ? what is the use of this class and how to use it in main method
    // ! this is important to write package name in java or not?
    // TODO: 1. create a class name person
    private int age;
    Person(int age){
        if(age<=-1){
            this.age=0;
            System.out.println("Age is not valid, setting age to 0.");

        }
        else{
            this.age=age;
        }
    }
    public  void yearPass(int age){
        age++;
    }

    public void amIOld(int age){

        if(age< 13 ){
            System.out.println("you are young.");
        }
        else if(age >=13 && age < 18){
            System.out.println("you are a teenager.");
        }
        else{

            System.out.println("you are old.");
        }
    }



}
public class Solution{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int age= -5;
        Person p = new Person(age);
        // setting 0
        p.yearPass(age);
        p.yearPass(age);
        p.yearPass(age);
        p.amIOld(age);// you are young
        // System.out.println();
        //  p.amIOld(4);// you are young
       // p.amIOld(age);
        // case1

        age=4;
        p.amIOld(age);
        System.out.println();
        p.yearPass(age);
        p.yearPass(age);
        p.yearPass(age);
        p.amIOld(age);// tennager

        age=16;
        p.amIOld(age);
        System.out.println(age);
        // acse
        System.out.println();
        //p.amIOld();
        p.yearPass(age);
        p.yearPass(age);
        p.yearPass(age);//old
        p.amIOld(age);
        age=18;
        p.amIOld(age);
        System.out.println();
        p.amIOld(age);
        p.yearPass(age);
        p.yearPass(age);
        p.yearPass(age);
        p.amIOld(age);

    }
}
