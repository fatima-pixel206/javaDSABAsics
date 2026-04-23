package If_Else.Stack;

public class CharStack {
    int top =-1;
     private int cap ;

    char[] c ;
   public CharStack(String le){
        this.cap=le.length();
       this.c = new char[cap];
   }
    public int getSize(){
       return top+1;
    }
    // is empty
    public boolean isEmpty(){
       if(top == -1)
           return true;
       else
           return false;
    }
    // is full
    public boolean isFull(){
       if(top == cap-1){
           return true;
       }
       else return false;
    }
    // push
    public int push(char v){
       if(isFull()){
           System.out.println(" stack is full");
           return -1 ;
       }
       else {
        top++;
           c[top] = v;

       }
       return 0;
    }
    // pop
    public char pop(){
       if(isEmpty()){
           System.out.println("stack is empty");
           return '0';
       }

           char temp= c[top];
           top--;
       return temp;

    }
    public char peak(){
       return c[top];
    }

    static void main() {
        CharStack c = new CharStack("a+b");
        c.push('a');
        System.out.println(c.pop());
    }
}
