import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        while (true){

            String command = scanner.nextLine();
            String[] commands = command.split(" ");

            if (commands[0].equals("end")){
                System.out.println("Goodbye");
                break;
            } else if (commands[0].equals("create")) {
                BankAccount acc = new BankAccount();
                accounts.put(acc.id, acc);
                System.out.printf("Account #%d created\n", acc.id);
            } else if (commands[0].equals("deposit")) {
                int accId = Integer.parseInt(commands[1]);
                BankAccount acc = accounts.get(accId);
               if (acc != null){
                    double depositValue = Double.parseDouble(commands[2]);
                    acc.deposit(depositValue);
                   System.out.printf("Deposited %.2f to account #%d\n", depositValue, accId);
                }else {
                   System.out.printf("Account #%d not found\n", accId);
               }
            }else if (commands[0].equals("calc-interest")) {
                int accId = Integer.parseInt(commands[1]);
                BankAccount acc = accounts.get(accId);
                if (acc != null){
                    int months = Integer.parseInt(commands[2]);
                    System.out.printf("Interest: %.2f\n", acc.calcInterest(months));
                }else {
                    System.out.printf("Account #%d not found\n", accId);
                }
            } else if (commands[0].equals("set-interest")) {
                Double newInterest = Double.parseDouble(commands[1]);
                BankAccount.setInterestRate(newInterest);
                System.out.printf("Interest rate changed: %.2f\n", newInterest);
            }else {
                System.out.println("Invalid command: " + command);
            }
        }
    }
}
