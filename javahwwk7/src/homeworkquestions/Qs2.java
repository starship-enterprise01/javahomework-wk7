package homeworkquestions;

public class Qs2 {

    static String post="Field Marshal"; //static variable declare 2.1
    static int division= 1; //static variable declare 2.1
    public static void main(String[] args) { //static main method declare 2.4
        command();//static method called in main method 2.5
    }
    public static void command(){ //static method declare 2.2
        System.out.println(post); //static variable called in static method 2.3
        System.out.println(Qs2.division); //static variable called in static method 2.3
    }


}
