package homeworkquestions;

public class Qs4 {
    static int a = 18;
    int b =21;
    static String c = "Legal Drinking Age";
    String d = "In USA Legal Drinking Age";

    public void age(){
        System.out.println(c + " is " + a + " while "+ d + " is " + b);
    }

    public static void warning(){
        Qs4 i = new Qs4();
        System.out.println("Seriously the " + c + " is " + a + " while " + i.d + " is " + i.b);
    }

    public static void main(String[] args) {
        Qs4 j=new Qs4();
        j.age();
        warning();
    }
}
