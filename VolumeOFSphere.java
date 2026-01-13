package BasicOfDSA;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VolumeOFSphere {
    //4/3pircube
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter value of radius");
        double radius=sc.nextDouble();
        double pi=3.14159;
        double sphere=(4/3)*pi*radius*radius*radius;
        System.out.println(sphere);
    }
}
