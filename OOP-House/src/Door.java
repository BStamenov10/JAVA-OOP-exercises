public class Door {
    protected String color;
    public Door() {
        color = "Brown";
    }

    public Door(String color) {
        this.color = color;
    }
    public final String getColor() {
        return color;
    }

    public final void setColor(String value) {
        color = value;
    }

    public final void ShowData() {
        System.out.printf("I am a door, my color is: %1$s", color);
    }
}
