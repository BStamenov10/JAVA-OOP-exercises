public class Table {

   private double width;
   private double height;

   public Table(double width, double height) {
        this.width = width;
        this.height = height;
   }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  double getHeight() {
        return height;
    }

    public  void showData() {
        System.out.printf("The width is: %1s - The height is: %2s" + "\r\n", width , height);
    }

}
