import java.math.*;

public class Calculating {
    public void calculating(BigDecimal firstNum, BigDecimal secondNum, String operator) {
        MathContext mc = new MathContext(2); // 2 precision
        BigDecimal decimalFirstNum = new BigDecimal(String.valueOf(firstNum));
        BigDecimal decimalSecondNum = new BigDecimal(String.valueOf(secondNum));
        BigDecimal result;
        
        switch (operator) {
            case ("+"):
                result = decimalFirstNum.add(decimalSecondNum);
                System.out.println(result);
                break;
            case ("-"):
                result = decimalFirstNum.subtract(decimalSecondNum, mc);
                System.out.println(result);
                break;
            case ("/"):
                result = decimalFirstNum.divide(decimalSecondNum);
                System.out.println(result);
                break;
            case ("*"):
                result = decimalFirstNum.multiply(decimalSecondNum);
                System.out.println(result);
                break;

        }
    }
}
