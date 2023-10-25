package homeworkquestions;

public class Qs13 {
    public static class RectangleInfo {
        public double area;
        public double perimeter;

        public RectangleInfo(double area, double perimeter) {
            this.area = area;
            this.perimeter = perimeter;
        }
    }

    public static RectangleInfo DataValue(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);
        return new RectangleInfo(area, perimeter);
    }

    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;

        RectangleInfo info = DataValue(width, height);

        System.out.println("Area of rectangle is " + info.area);
        System.out.println("Perimeter of rectangle is " + info.perimeter);
    }
}

