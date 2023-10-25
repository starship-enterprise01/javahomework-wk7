package homeworkquestions;

public class Qs5 {
            public static void main(String[] args) {
            Qs5 calculator = new Qs5();

            System.out.println("Addition: " + add(15, 3));
            System.out.println("Subtraction: " + calculator.subtract(18, 4));
            System.out.println("Multiplication: " + multiply(26, 22));
            System.out.println("Division: " +calculator.divide(100, 26));
        }

        public static int add(int a, int b) {
        return a + b;
        }

        public int subtract(int a, int b) {
        return a - b;
        }

        public static int multiply(int a, int b) {
        return a * b;
        }

        public double divide(int a, int b) {
        return (double) a / b;
        }
    }
