import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Create a class named "Table". It must have a constructor, indicating the width and height of the board.
        // It will have a method "ShowData" which will write on the screen the width and that height of the table.
        // Create an array containing 10 tables, with random sizes between 50 and 200 cm, and display all the data.

        Table[] tables = new Table[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            tables[i] = new Table(random.nextInt(50, 200), random.nextInt(50, 200));
            tables[i].showData();
        }
    }
}
