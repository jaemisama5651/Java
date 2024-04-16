package programming.consoleProgramming.simpleCalculator.src;

import java.util.Scanner;

public class SimpleCalcuator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        Double firstNumber = sc.nextDouble();
        System.out.println("두 번째 숫자를 입력하세요.");
        Double secondNumber = sc.nextDouble();
        System.out.println("연산자를 입력하세요. 예) + - * /");
        String operator = sc.next();

        double result;

        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case  "*":
                result = firstNumber * secondNumber;
                break;
            case  "/":
                if (secondNumber == 0){
                    System.out.println("0으로 나눌수 없습니다");
                    return;
                }
                result = firstNumber / secondNumber;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;

        }
        System.out.println(result);

    }
}
