public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(3);

        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(6);
        rectangle.setLength(4);

        System.out.println(rectangle);

        Triangle triangle = new Triangle();
        triangle.setA(6);
        triangle.setB(9);
        triangle.setC(9.7);
        triangle.setH(6);

        System.out.println(triangle);


    }
}
