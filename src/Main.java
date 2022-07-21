import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculating calculating = new Calculating();
        Print print = new Print();
        CheckingInput checkingInput = new CheckingInput();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            print.print("Provide the first number: ");
            String input1 = scanner.nextLine();
            if (!checkingInput.checkInput(input1) || input1.isEmpty()) {
                print.print("Wrong input");
                continue;
            }

            print.print("Provide the second number: ");
            String input2 = scanner.nextLine();
            if (!checkingInput.checkInput(input2) || input2.isEmpty()) {
                print.print("Wrong input");
                continue;
            }

            print.print("Provide the operator: ");
            String operator = scanner.nextLine();
            if (checkingInput.checkInput(operator) || operator.isEmpty()) {
                continue;
            }

            calculating.calculating(Integer.valueOf(input1), Integer.valueOf(input2), operator);
            break;
        }
    }
}