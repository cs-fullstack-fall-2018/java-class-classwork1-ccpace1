public class Main2 {

    public static void main(String[] args) {
        Point xy = new Point();
        xy.printPoint();

        Point x2y2 = new Point(5, 6);
        x2y2.printPoint();

        Point x3y3 = new Point(2,2);
        x3y3.printPoint();

    Dog jake = new Dog("Jake", "Retriever", 7, "Golden");
    System.out.println(jake);

    Bicycle mountain = new Bicycle(6, 8, 1);
    System.out.println(mountain);

    }
}