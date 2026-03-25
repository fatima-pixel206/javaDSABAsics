package If_Else.ArrayDSA.StringArray;


    /*
    Dated 15,March 2026
    there is array of strings and a string check which index almost match excepting one char
    example banana  banaba there is only difference of one char
     */
    public class MismatchString {


        static void main() {
            String[]ar=new String[3];
            ar[0]="ali";
            ar[1]="khahala";
            ar[2]="shaha";
            //ar[3]="wali";
            //  ar[4]="haha";
            //  ar[5]="hahaaa";
            //ar[3]="hahe";
            // ar[7]="fafima";
            String a="shahe";
            ReplaceMisMatch(ar,a);
            for (String e  : ar) {
                System.out.println(e);
            }
        }
        // Approach 1
        // replace the string
        public static boolean isOneCharDifferent(String a, String b) {
            int diff=0;
            if(a.length()!=b.length())
                return false;
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) != b.charAt(i)){
                    diff++;
                }
            }

            return  diff==1;
        }
        public static void ReplaceMisMatch(String[] ar, String b) {
            for (int i = 0; i <ar.length ; i++) {
                if(isOneCharDifferent(ar[i],b)){
                    ar[i]=b;
                }

            }
        }
        // Approach 2
    /*
    In Approach 1 we replace the whole string but in this
    approach we just replace a mismatch char using StringBulider

     */
        public static void mismatchChar(String[] ar,String b) {
            for (int i = 0; i < ar.length ; i++) {
                if(ar[i].length()!=b.length()){
                    continue;
                }
                int diff=0;
                int index=-1;
                for (int j = 0; j <ar[i].length() ; j++) {
                    if(ar[i].charAt(j) != b.charAt(j)){// checking mismatch char
                        diff++;
                        index=j;// save position
                    }

                }
                if(diff==1){
                    StringBuilder sb =  new StringBuilder(ar[i]);
                    sb.setCharAt(index,b.charAt(index));// change a specific char
                    ar[i]=sb.toString();// converting StringBuilder to string
                }
            }
            for(String s:ar){
                System.out.println(s);
            }
        }
    }


