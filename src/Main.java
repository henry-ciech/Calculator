import java.math.BigDecimal;
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
            if (!checkingInput.checkInput(input1) || input1.isEmpty() ||  input1.equals("-0")) {
                print.print("Wrong input");
                continue;
            }
            BigDecimal decimalInput1 = new BigDecimal(input1);

            print.print("Provide the second number: ");
            String input2 = scanner.nextLine();
            if (!checkingInput.checkInput(input2) || input2.isEmpty() || input1.equals("-0")) {
                print.print("Wrong input");
                continue;
            }
            BigDecimal decimalInput2 = new BigDecimal(input2);

            print.print("Provide the operator: ");
            String operator = scanner.nextLine();
            if (checkingInput.checkInput(operator) || operator.isEmpty() || operator.length() > 1) {
                print.print("Wrong input");
                continue;
            }

            calculating.calculating(decimalInput1, decimalInput2, operator);
            break;
        }
    }
}