package If_Else.BasicOfDSA;

import java.util.Scanner;

public class ConversionToBinary {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter anything to convert to Binary: ");

        String input = sc.nextLine();

        if(input.matches("[0-9]+")){
            int  inPut=Integer.parseInt(input);
            toConversion(inPut);
        }
        else{


            toConversion(input);
//
        }
    }
    public static void toConversion(String str){
        // String result="";
        for (int i = 0; i <str.length() ; i++) {
            int in= (int)str.charAt(i);
            String result="";
            for (int j = in; j >0 ; j/=2) {

                int binary = j % 2;
                result = binary + result;
                // in = in / 2;
            }
            System.out.print(result+" ");
        }
        //System.out.print(result+" ");
        //  System.out.println();
    }



    // number conversion
    public static void toConversion(int number){

        String result="";
        while(number>0){

            int binary = number % 2;
            result = binary+result;
            number/=2;

        }
        System.out.print(result+" ");
    }

}
