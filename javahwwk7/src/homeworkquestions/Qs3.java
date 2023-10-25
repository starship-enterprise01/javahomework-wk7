package homeworkquestions;

public class Qs3 {
    int a = 18;
    static String b = "Legal Drinking Age";

    public void age(){
        System.out.println(b + " is " + a);
    }

    public static void warning(){
        Qs3 i = new Qs3();
        System.out.println("Seriously the " + b + " is " + i.a );
            }

    public static void main(String[] args) {
        Qs3 j=new Qs3();
        j.age();
        warning();
    }
}

