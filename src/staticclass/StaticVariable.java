package staticclass;

public class StaticVariable {
    static String name=" fati";
    static String rollno;
    static int obtainMarks;
    static int totalMarks;

    StaticVariable( String name, String roll,int obtainMarks,int totalMarks){
        this.name=name;

        rollno=roll;
        this.obtainMarks=obtainMarks;
        this.totalMarks=totalMarks;

    }

    public void printInfo(){
        System.out.println(" Name :"+name +" \n "+  " Roll no :"+rollno+" Marks : "+ obtainMarks);
    }

}
