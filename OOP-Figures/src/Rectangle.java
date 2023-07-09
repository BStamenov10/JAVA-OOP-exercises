public class Rectangle extends Shape {

    private double length;
    private double width;
    public  Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return String.format("%nRectangle with length: %.2f and width %.2f\n" +
                "The area is: %.2f and the perimeter is %.2f", this.length, this.width, getArea(),getPerimeter());
    }
}
