package homeworkquestions;

public class Qs17 {
    String city = "Leicester";
    static String country = "UK";

    public static void main(String[] args) {
        Qs17 mu=new Qs17();
        b();
        mu.a();

    }
    public void a(){
        System.out.println(country);
    }
    public static void  b(){
        Qs17 u=new Qs17();
        System.out.println(u.city);
    }
}
