public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.6,45.3);
        rectangle.setHeight(4.6);
        rectangle.getHeight();
        rectangle.setWidth(7.5);
        rectangle.getWidth();


        System.out.println("The area of this rectangle is = "+rectangle.getArea());
        System.out.println("The perimeter of this rectangle is = "+rectangle.getPerimeter());

    }
}
