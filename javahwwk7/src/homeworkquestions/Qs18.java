package homeworkquestions;

public class Qs18 {
    public String houseNumber = "210";
    public static String council = "Leicester City";

    public static void main(String[] args) {
        Qs18 rho=new Qs18();
        address();
        rho.borough();

    }
    public void borough(){
        System.out.println(council);
    }
    public static void  address(){
        Qs18 u=new Qs18();
        System.out.println(u.houseNumber);
    }
}
