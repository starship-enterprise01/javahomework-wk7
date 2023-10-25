package homeworkquestions;

public class Qs7 {

    public static double temperature (double F){
        return (F-32)*5/9;
    }

    public static void main(String[] args) {
        double F = 100;
        System.out.println("degree Celcius is "+ temperature(F));
    }
}
