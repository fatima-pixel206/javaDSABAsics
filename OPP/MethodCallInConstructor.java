package If_Else.OPP;

public class MethodCallInConstructor {
    private String name;

    public MethodCallInConstructor(String name) {
        this.name = name;
        show();
    }

    public void show() {
        System.out.println("show something");
    }
}

      class A extends MethodCallInConstructor{
    A() {
        super("hii");
    }
}
