package ArrayInMemory;

public class Hetro {

    int id;
    String nome;
    double cgpa;

    public static void main(String[] args) {
        Hetro h = new Hetro();
        Hetro[] arrayObj = new Hetro[3];
        //arrayObj[0] = ;

        arrayObj[0] = new Hetro();
        arrayObj[1] = new Hetro();
        System.out.println(arrayObj[0]);
        System.out.println(arrayObj[1]);
        arrayObj[0].id=90;
        arrayObj[1].nome="Fati ma";
        arrayObj[1].cgpa=91;
        arrayObj[1].id=90;
        if(arrayObj[0].id==arrayObj[1].id){
            System.out.println("Fati ma!");
        }
        else{
            System.out.println(arrayObj[0]==arrayObj[1]);
        }
    }
}
