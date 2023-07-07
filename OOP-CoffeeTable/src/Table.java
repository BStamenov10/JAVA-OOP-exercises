public class Table {
    protected float width;
    protected float height;
    public Table() {

    }

    public Table(float width, float height) {
        this.setWidth(width);
        this.setHeight(height);
    }


    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void showData() {
        System.out.printf("The Table has width of: %.2f and height of: %.2f \n", width,height);
    }
}
