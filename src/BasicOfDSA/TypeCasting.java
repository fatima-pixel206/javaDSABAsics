package BasicOfDSA;

public class TypeCasting {
    public static void main(String[] args) {
        char ch= '$';
        System.out.println((int)ch);
        //int x=ch;
        int x= (int)ch;// implicit typeCasting
         x =(int)ch;// explicit typCasting
        System.out.println( x);
        for( int i=1; i<=128;i++){
            System.out.println((char)i+ " " +i);
        }
        char cha= 'b';
        System.out.println(cha+0); // the best way to finding a asscii value
        System.out.println(cha+x);// this is possible
            // integer to char
        int a= 65;
        char c=(char)a;
        System.out.println(c);
        int nr = 89;
        char nrr=(char)nr;
        System.out.println(nrr);
        System.out.println(nrr+c);
        int f=70;
        char ec= (char)f;
        System.out.println(ec);
        char space=' ';
        int spint = space;
        System.out.println(spint);
    }
}
