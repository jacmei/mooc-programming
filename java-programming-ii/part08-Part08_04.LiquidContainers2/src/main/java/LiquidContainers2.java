
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] splitInput = input.split(" ");
            String operation = splitInput[0];
            int amount = Integer.valueOf(splitInput[1]);
            if (operation.equals("add")) {
                first.add(amount);
            }
            if (operation.equals("remove")) {
                second.remove(amount);
            }
            if (operation.equals("move")) {
                int firstAmount = first.contains();
                if (firstAmount < amount) {
                    amount = firstAmount;
                }
                first.remove(amount);
                second.add(amount);
            }
        }
    }
}
