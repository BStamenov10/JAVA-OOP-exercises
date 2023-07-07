public class CoffeeTable extends Table {

    private float width;
    private float height;


    public CoffeeTable(){

    }
    public CoffeeTable(float width, float height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public final void setHeight(float height) {
        this.height = height;
    }

    @Override
    public final float getHeight() {
        return height;
    }

    @Override
    public final void setWidth(float width) {
        this.width = width;
    }

    @Override
    public final float getWidth() {
        return width;
    }

    @Override
    public final void showData() {
        System.out.printf("CoffeeTable has width of: %.2f and height of: %.2f \n", width,height);
    }
}
