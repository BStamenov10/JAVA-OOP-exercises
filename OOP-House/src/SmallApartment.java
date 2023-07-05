public class SmallApartment extends House{
    public SmallApartment() {
        super(50);
    }
    @Override
    public void ShowData(){
        System.out.println("I am an apartment, my area is " + area + " m2");
    }
}
