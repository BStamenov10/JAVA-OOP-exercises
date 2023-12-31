public class Circle extends Shape{
    private  double radius;

    public  Circle() {

    }
    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("The circle radius is: %.2f%nThe area is: %.2f%n" +
                "The perimeter is %.2f",this.radius,getArea(),getPerimeter());
    }
}
