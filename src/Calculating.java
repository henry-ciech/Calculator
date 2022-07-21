public class Calculating {
    public void calculating(float firstNum, float secondNum, String operator) {
        float result;
        switch (operator) {
            case ("*"):
                result = firstNum * secondNum;
                PrintResult printResult1 = new PrintResult(result);
                printResult1.getResult();
                break;
            case ("/"):
                result = firstNum / secondNum;
                PrintResult printResult2 = new PrintResult(result);
                printResult2.getResult();
                break;
            case ("+"):
                result = firstNum + secondNum;
                PrintResult printResult3 = new PrintResult(result);
                printResult3.getResult();
                break;
            case ("-"):
                result = firstNum - secondNum;
                PrintResult printResult4 = new PrintResult(result);
                printResult4.getResult();
                break;
        }
    }
}
