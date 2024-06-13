package welcome;

public class Hello {
    private String a;

    public void setupName(String name){
        a = name;
    }
    public void welcome(){
        System.out.println("Hello, " + a);
    }
    public void byeBay(){
        System.out.println("Bye, " + a);
    }
}
