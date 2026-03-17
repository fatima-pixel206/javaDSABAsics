package ArrayDSA.StringArray;
/*
Dated 15,March 2026
there is array of strings and a string check which index almost match excepting one char
example banana  banaba there is only difference of one char
 */
public class MismatchString {
    public static void mismatch(String name, String[]ar){

        for (int i = 0; i <ar.length ; i++) {
            if(ar.length == name.length()){
             //   char[] chars= ar[i].toCharArray();
                        int mismatch = 0;
                      //  int index = -1;
                        for (int j = 0; j < name.length(); j++) {
                            if (ar[i].charAt(j) != name.charAt(j)) {
                                mismatch++;
                               // index = j;
                            }
                        }
                        if(mismatch == 1){
                            ar[i] = name;
                            //ar[i]=new String(chars);

                        }

            }
        }
        for(String str:ar){
            System.out.println(str);
        }
    }

    static void main() {
        String[]ar=new String[8];
//        ar[0]="ali";
//        ar[1]="khahala";
//        ar[2]="shaha";
//        ar[3]="wali";
//        ar[4]="haha";
//        ar[5]="hahaaa";
//        ar[6]="hahe";
        ar[7]="fafima";
        String name="fatima";
        mismatch(name,ar);
        for (String e  : ar) {
            System.out.println(e);
        }
    }
}
