package homeworkquestions;

public class Qs1 {
    int age = 80; //instance variable 1.1
    String name = "Sam Bahadur"; // instance variable 1.1

    public static void main(String[] args) { // main method declared 1.4
        Qs1 j = new Qs1();//instance method called in main method 1.5
        j.id();
    }
    public void id(){ //instance method 1.2
        System.out.println(name); // instance variable called in instance method 1.3
        System.out.println(age); // instance variable called in instance method 1.3
    }
}
