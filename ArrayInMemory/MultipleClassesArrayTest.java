package ArrayInMemory;

public class MultipleClassesArrayTest {
    public static void main(String[] args) {
        // create object of main class MultipleClasses
        // object one
        MultipleClasses multiObj = new MultipleClasses();
        multiObj.cla = "These is Parent class  ";
        multiObj.sum(34, 67, 89);//190

        // now create an object with upcasting class MultipleClassOne
        // object two
        MultipleClasses oneObj = new MultipleClassOne();
        // oneObj.cla1="These is child  class  of MultipleClasses ";

        oneObj.sum(34, 67, 89);
        oneObj.v3 = 789;
        System.out.println(oneObj.v3);

        // now create an object with upcasting class MultipleClassTwo
        // object three
        MultipleClasses twoObj = new MultipleClassTwo();
        twoObj.cla = "These is second child class  of MultipleClasses ";

        twoObj.sum(34, 67, 89);
        // making  objects of child classes with their own
        MultipleClassOne oneO = new MultipleClassOne();
        MultipleClassTwo twoO = new MultipleClassTwo();
        oneO.cla1=" fourth object child ";
        twoO.cla2=" fifth object child ";
        // showing classes
        multiObj.showClassOne();
        System.out.println();
        oneObj.showClassOne();
        System.out.println();
        twoObj.showClassOne();
        oneO.showClassOne();
        twoO.showClassOne();
        // making array of ojects

        MultipleClasses[] arrayObj = new MultipleClasses[5];

        arrayObj[0] = multiObj;
        arrayObj[1] = oneObj;
        arrayObj[2] = twoObj;
        arrayObj[3] = oneO;
        arrayObj[4] = twoO;
        System.out.println(arrayObj);
        System.out.println(arrayObj[0].cla);
        System.out.println(arrayObj[1].cla);
        System.out.println(arrayObj[2].cla);
        System.out.println(arrayObj[3].cla);
        System.out.println(arrayObj[4].cla);
    }

}