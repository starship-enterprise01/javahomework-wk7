package homeworkquestions;

public class Qs12 {
    public double tres (double a, double b, double c){
        double result = (a+b+c)/3;
        return result;
    }

    public static void main(String[] args) {
        Qs12 n = new Qs12();
        System.out.println("Average is " + n.tres(15.56,200,157));
    }

}
