package homeworkquestions;

public class Qs9 {

    public static String inputupper (String Sentence){
        return Sentence.toLowerCase();
    }

    public static void main(String[] args) {
        String Sentence = "CONVERTED TO LOWER CASE";
        System.out.println("UPPER CASE IS NOW: "+ inputupper(Sentence));
    }
}
