package zadanie2;

public class PointCheck {
    static Point punkt1 = new Point(10, 20);
    static Point punkt2 = new Point(6, 10);

    public static void main(String[] args) {
        System.out.println("Odległość pomiędzy punktami wynosi: " + Point.distance(punkt1, punkt2));

    }
}
