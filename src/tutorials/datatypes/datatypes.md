# 데이터 타입
[contents](../../../README.md)  
## 기본 자료형
자바에서 8가지 기본적인 데이터 타입으로 객체가 아닌 기본 데이터 타입이며 스택 메모리에 직접 저장됩니다.
각 타입은 특정 크기의 데이터를 저장하며, 프로그래밍 시 변수의 타입과 값을 범위를 정의하는데 사용합니다.
   
### 정수형
- byte: 8비트 정수형, 범위는 -128 ~ 127, 낮음 메모리를 요구하는 배열이나 파일 스트림에 주로 사용
- short: 16비트 정수형, 범위는 -32,768 ~ 32.767, byte보다 큰 배열이 필요할 때 사용
- int: 32비트 정수형, 범위는 앿 -21억 ~ 21억, 자바에서 기본적으로 사용되는 정수형
- long: 64비트 정수형, 매우 큰 값이 필요할 때 사용, 숫자 뒤에 L 또는ㅣ붙여서 표현
    ```java
    public class IntegerExample {
        public static void main(String[] args) {
            byte myByte = 127; 
            short myShort = 32767; 
            int myInt = 2147483647; 
            long myLong = 9223372036854775807L; 
    
            System.out.println("Byte 값: " + myByte);
            System.out.println("Short 값: " + myShort);
            System.out.println("Int 값: " + myInt);
            System.out.println("Long 값: " + myLong);
        }
    }
    ```
### 실수형
- float: 32비트 실수형으로, 소수점 이하 7자리 정도의 정밀도 가짐, 숫자 뒤에 F 또는 f를 붙여서 표현
- double: 64비트 실수형으로, 소수점 이하 15자리 정도의 정밀도를 가짐, 과학 계산이나 정밀한 계산에 주로 사용
    ```java
    public class FloatingPointExample {
        public static void main(String[] args) {
            float myFloat = 9.99f; 
            double myDouble = 9.99;
  
            System.out.println("Float 값: " + myFloat);
            System.out.println("Double 값: " + myDouble);
        }
    }
    ```
### 문자형
- char: 16비트 유니코드 문자를 저장, 작은 따옴표('')로 묶어서 표현합니다.
    ```java
    public class CharExample {
        public static void main(String[] args) {
            char myChar = 'A';
            char myUnicodeChar = '\u0041'; // 유니코드 표현을 사용하여 'A' 문자 저장
            
            System.out.println("Char 값: " + myChar);
            System.out.println("Unicode Char 값: " + myUnicodeChar);
        }
    }
    ```
### 논리형
- boolean: true 또는 false의 두 가지 값만을 가집니다. 주로 조건문과 논리 연산에서 사용합니다.
    ```java
    public class BooleanExample {
        public static void main(String[] args) {
            boolean isJavaFun = true; 
            boolean isFishTasty = false;
            
            System.out.println("Java는 재밌나요? " + isJavaFun); // true 출력
            System.out.println("물고기는 맛있나요? " + isFishTasty); // false 출력
        }
    }
    ```
  
## 참조 자료형(ReferenceType)
참조형 데이터 타입은 객체가 저장된 메모리의 주소를 참조하는 변수 타입입니다. 
### 클래스(Class)
- 사용자 정의 데이터 타입. 객체 지향 프로그래밍의 기본 단위입니다.
### 인터페이스(Interface)
- 모든 메소드가 추상 메소드로 선언되어 있는 타입 클래스가 인터페이스를 구현할 때 인터페이스에 선언된 모든 메소드를 정의해야합니다.
### 배열(Array)
- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 자료구조입니다.
### 열거형(Enum)
- 한정된 상수 집합을 정의할 때 사용하는 타입입니다.
