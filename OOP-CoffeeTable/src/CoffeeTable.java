public class CoffeeTable extends Table {

    public CoffeeTable(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public final void showData() {
        System.out.printf("CoffeeTable has width of: %.2f and height of: %.2f \n", width,height);
    }
}
