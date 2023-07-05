public class House {

    protected int area;
    protected Door door;
    House(int area) {
        this.area= area;
        door = new Door();
    }

    public final void setArea(int area){
        this.area = area;
    }

    public final int getArea() {
        return area;
    }

    public final Door getDoor() {
        return door;
    }

    public final void setDoor(Door door) {
        this.door = door;
    }

        public void ShowData() {
        System.out.printf("I am a house, my area is %1$s m2" + "\r \n",  area);
    }

}
