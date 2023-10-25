package homeworkquestions;

public class Qs14 {
    int x = 125;
    int y = 24;
    int sum=x+y;
    int difference=x-y;
    int multiply=x*y;
    int divide=x/y;
    int modulo=x%y;
    public static void main(String[] args) {
    Qs14 number= new Qs14();

        System.out.println(number.x + " + " +number.y + " = " + number.sum);
        System.out.println(number.x + " - " +number.y + " = " + number.difference);
        System.out.println(number.x + " x " +number.y + " = " + number.multiply);
        System.out.println(number.x + " / " +number.y + " = " + number.divide);
        System.out.println(number.x + " mod " +number.y + " = " + number.modulo);
    }
}
