public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle() {

    }
    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public String toString() {
        return String.format("%nYour triangle has a side a: %.2f - side b: %.2f - side c: %.2f and height: %.2f%n" +
                "The area is: %.2f and the perimeter is %.2f",this.a,this.b,this.c,this.h,getArea(),getPerimeter());
    }
}
