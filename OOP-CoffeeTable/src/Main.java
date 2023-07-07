import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Table[] myTables = new Table[10];
        Random rnd = new Random();

        for (int i = 1; i <= 10; i++) {
            if (i <= 5){
                myTables[i-1] = new Table(rnd.nextInt(50,200), rnd.nextInt(50,200));
                myTables[i-1].showData();
            } else {
                myTables[i-1] = new CoffeeTable(rnd.nextInt(40,120), rnd.nextInt(40,120));
                myTables[i-1].showData();
            }
        }

    }
}
