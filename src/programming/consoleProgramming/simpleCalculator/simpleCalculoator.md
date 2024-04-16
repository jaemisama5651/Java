# 간단한 계산기
[목차](../../JavaProgmming.md)

## 파일 및 폴더 구성
```
SimpleCalculator/
│
├── src/                       # 소스 코드가 위치하는 디렉터리
│   └── SimpleCalculator.java  # 계산기 프로그램 소스 파일
│
└── simpleCalculotor.md                  # 프로젝트 설명 파일

```

## 코드 작성
src 폴더안에 SimpleCalculato.java 파일생성하고 아래 코드를 작성합니다.
```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("첫 번째 숫자를 입력하세요: ");
        double firstNumber = scanner.nextDouble();
        
        System.out.println("두 번째 숫자를 입력하세요: ");
        double secondNumber = scanner.nextDouble();
        
        System.out.println("연산자를 입력하세요 (+, -, *, /): ");
        String operator = scanner.next();
        
        double result;
        
        switch(operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if(secondNumber == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }
        
        System.out.println("결과: " + result);
    }
}

```
사용자로 부터 두개의 숫자와 수행할 연산자를 입력 받아 연산 처리후 출력하는 프로그램입니다.
### 1. 스캐너 생성
```java
Scanner scanner = new Scanner(System.in);
```
- Scanner 클래스의 객체를 생성합니다. System.in은 표준 입력 스트림(키보드 입력)의미 합니다.
### 2. 사용자 입력받기
```java
System.out.println("첫 번째 숫자를 입력하세요: ");
double firstNumber = scanner.nextDouble();

System.out.println("두 번째 숫자를 입력하세요: ");
double secondNumber = scanner.nextDouble();

System.out.println("연산자를 입력하세요 (+, -, *, /): ");
String operator = scanner.next();
```
- 순서대로 사용자로부터 입력을 받습니다 숫자는 실수 연산자는 문자열로 받습니다.
### 3. 연산자에 따른 연산 수행
``` java
double result;

switch(operator) {
    case "+":
        result = firstNumber + secondNumber;
        break;
    case "-":
        result = firstNumber - secondNumber;
        break;
    case "*":
        result = firstNumber * secondNumber;
        break;
    case "/":
        if(secondNumber == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        result = firstNumber / secondNumber;
        break;
    default:
        System.out.println("잘못된 연산자입니다.");
        return;
}
```
- switch 문을 사용해서 입력받은 연산자에 따라 연산 종류가 달라집니다. 나눗셈을 할때 분모가 0인지 확인하는 프로그램입니다.
### 4. 결과 출력
```java
System.out.println("결과: " + result);
```
- 문자열 + 결과 변수로 + 연산자로 문자열와 변수를 연결하여 결과를 출력합니다.
## 결론
scanner객체를 생성하고 숫자와 연산자를 입력받은 다음 switch 문으로 연산자의 입력 조건 따라 원하는 연산 결과 수행 할 수 있습니다.  