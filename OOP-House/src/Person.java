public class Person{
    protected String name;
    protected House house;
     public Person(){
        this.name = "Juan";
        house = new House(150);
    }
    public  Person(String name, House house){
         this.name = name;
         this.house = house;
    }
    public final String getName() {
         return name;
    }
    public final void setName(String name) {
         this.name = name;
    }
    public final House getHouse() {
         return house;
    }
    public  final void setHouse(House house){
         this.house = house;
    }
    public final void ShowData() {
        System.out.printf("My name is %1$s." + "\r \n", name);
        house.ShowData();
        house.getDoor().ShowData();
    }
}
