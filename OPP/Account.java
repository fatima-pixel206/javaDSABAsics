package If_Else.OPP;

public class Account {


        private static   String name =" Fatima";
            private String surname;
            private int age;
            private double cash;


    public Account setName(String name) {

        this.name = name;
        //name= "hi";
        return this;
    }
    public String getName() {
       // System.out.println(name.hashCode());
        return name;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
