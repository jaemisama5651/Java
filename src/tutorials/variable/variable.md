# 변수
[목차](../tutotials.md)  
1. [변수의 기본 개념](#1)
2. [변수의 타입](#2)
3. [변수의 선언과 초기화](#3)
4. [변수의 범위와 생명주기](#4)
5. [변수의 명명 규칙](#5)
6. [변수와 메모리](#6)
---
<a id="1"></a>
 ## 1.변수의 기본 개념
### 변수란 무엇인가?
변수는 데이터를 저장하기 위한 메모리 공간을 의미 합니다. 프로그래밍에서 변수는 데이터 값이 변할수 있는 데이터 항목을 저장하는 데 사용되며, 데이터를 저장하고 참조하는 데 필요한 주소를 가리키는 이름을 가집니다.
변수에 저장된 값을 프로그램 실행 중에 경될 수 있으며, 이러한 특성 때문에 변수라는 이름이 붙었습니다.

변수는 데이터를 저장하고 변경할 수 있는 이름이 붙은 메모리 공간입니다. 
### 변수의 용도와 중요성
- 데이터 저장
- 가독성
- 재사용성
- 계산과 조작
- 상태 관리

변수는 프로그래밍에서 데이터를 처리하는 기본적인 수단입니다. 따라서 변수의 사용은 프로그램의 효율성, 가독성 및  유지 보수에 영향을 미칩니다. 

---
<a id="2"></a>
## 2.변수의 타입
프로그래밍에서 변수는 다양한 유형의 데이터를 저장할 수 있으며, 유형은 기본 자료형(Primitive Data Types)과 참조 자료형(Reference Data Types)으로 나뉩니다.
### 기본 자료형
기본 자료형은 정수, 실수, 논리, 문자 구별되고 스택 메모리에 값을 직접 저장하기 때문에 처리 속도가 빠릅니다.
#### 정수형
숫자 데이터를 저장하는 데 사용됩니다.
- byte: 크기는 8비트, 범위는 -128~127
- short: 크기는 16비트, 범위는 -32,768~32,767
- int: 크기는 32비트, 범위는 약 -2.1억~2.1억, 가장 일반적으로 사용되는 타입
- long: 크기는 64비트, 범위는 약 -9.2경~9.2, 큰 숫자를 저장할 때 사용되는 타입, l또는 L 붙여 사용
```java
byte exampleByte = 100;
short exampleShort = 30000;
int exampleInt = 200000;
long exampleLong = 200000L;
```
#### 실수형
소수점이 있는 숫자를 저장하는 데 사용됩니다.
- float: 32비트의 실수형 대략적인 값만 필요할 때 사용합니다. f나 F을 붙여 사용합니다.
- double: 64비트의 실수형으로 더 정확한 소수점 값을 필요할 때 사용합니다.
```java
float exampleFloat = 3.14f;
double exampleDouble = 3.14159;
```
#### 논리형
참(ture) 또는 거짓(false)을 저장하는 데 사용됩니다.
- boolean: true 또는 false 값만 가질 수 있습니다.
```java
boolean exampleBoolean = true;
```
#### 문자형
단일 문자를 저장하는 데 사용됩니다.
- char: 단일 문자저장하며, 유니코드 문자를 표현합니다.
```java
char exampleChar = 'A';
char unicodeChar = '\u0041'; // 'A'의 유니코드
```
### 참조 자료형
자바에서 객체의 메모리 주소를 참조하는 데 사용되는 자료형입니다. 기본 자료형이 실제 값을 저장하는 것과 달리,
참조 자료형은 객체의 메모리 주소를 저장하는 변수 타입 입니다.
#### 문자열(String)
문자들의 시퀸스를 저장합니다.
```java
String exampleString = "Hello, World!";
```
#### 배열(Array)
동일한 타입의 여러 변수를 하나의 묶음으로 저장합니다.
```java
int[] exampleArray = {1, 2, 3, 4, 5};
```
#### 클래스(Class)
객체 지향 프로그래밍에서 사용되며, 데이터와 메서드를 묶어 하나의 새로운 타입을 생성합니다.
```java
public class Car {
    String brand;
    int year;
    
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}
```
#### 인터페이스(Interface)
모든 메서드가 추상 메서드(구현체가 없는 메서드)로만 이루어진 특별한 타입입니다
```java
interface Animal {
    void eat();
}
```
---
<a id="3"></a>
## 3. 변수의 선언과 초기화
프로그래밍에서 변수의 선언과 초기화는 데이터를 저장하고 관리하는 데 필수적인 과정입니다. 자바에서 변수를 사용하기 위해서는 먼저 변수의 타입에 맞게 선언을 하고, 필요한 경우 값을 할당하여 초기화해야 합니다.
### 변수 선언 방법
변수를 선언할 때는 변수의 타입을 먼저 명시한 후 변수의 이름을 지정합니다. 변수 이름은 대소문자를 구분하고 숫자로 시작할 수 업습니다.
```java
int age;
double salary;
boolean isEmployed;
char grade;
String name;
```
### 변수 초기화 방법
변수를 선언한 후에는 변수에 값을 할당하여 초기화할 수 있습니다. 초기화는 변수 선언과 동시에 이루어질 수도 있고, 선언 이후 별도로 이루어질 수 있습니다.
- 선언과 동시에 초기화하는 방법
     ```java
    int age = 30;
    double salary = 45000.50;
    boolean isEmployed = true;
    char grade = 'A';
    String name = "John Doe";
    ```
- 선언 후 초기화 하는방법
  ```java
  int age;
  age = 30;
  
  double salary;
  salary = 45000.50;
  
  boolean isEmployed;
  isEmployed = true;
  
  char grade;
  grade = 'A';
  
  String name;
  name = "John Doe";
  ```
### 상수
프로그램 실행 도중 값이 변경되지 않아야 하는 변수는 상수로 선언합니다. 상수를 선언하기 위해서 final 키워드를 변수 타입 앞에 추가합니다.
상수는 선언과 동시에 초기화해야하며, 이후는 값을 변경할 수 없습니다.
```java
final int MAX_HEIGHT = 200;
final double PI = 3.14159;
final boolean FLAG = true;
final char GRADE_A = 'A';
final String COUNTRY_NAME = "South Korea";
```
상수는 주로 프로그램 전체에서 고정된 값을 나타내는 데 사용합니다.

---
<a id="4"></a>
## 4. 변수의 범위와 생명주기
변수의 범위(scope)와 생명주기(lifecycle)는 변수가 어디에서 접근할 수 있는지 그리고 메모리 상에 존재하는 시간을 결정합니다.
### 지역 변수(Local Variables)
지역 변수는 메서드 내에서 선언되며 해당 메서드 또는 블록 내에서만 접근할 수 있습니다. 지역 변수의 생명 주기는 선언된 블록이 실행되는 동안에만 지속 됩니다.
```java
public void myMethod() {
    // 지역 변수 선언
    int localVariable = 5;
    System.out.println(localVariable); // 5 출력
}
// myMethod 밖에서는 localVariable에 접근할 수 없음.
```
### 멤버 변수(Member Variables) 필드(Fields)
멤버 변수는 클래스 내부에 선언되며 객체의 상태를 나타냅니다. 이러한 변수는 해당 클래스의 인스턴스가 생성될 때 생성되며 인스턴스가 가비지 컬렉터에 의해 수거될 때까지 생명주기가 지속됩니다.
```java
public class MyClass {
    // 멤버 변수(필드) 선언
    int memberVariable;
    
    public MyClass() {
        this.memberVariable = 10;
    }
}
```
### 클래스 변수(Class Variables) 정적 필드(Static Fields)
클래스 변수는 static 키워드를 사용하여 클래스 내부에 선언 됩니다. 이러한 변수는 모든 인스턴스에 공유되며 클래스가 메모리에 로드될 때 생성되어 프로그램이 종료될 때까지 유지됩니다.
```java
public class MyClass {
    // 클래스 변수(정적 필드) 선언
    static int classVariable = 20;
}
```
### 변수의 생명주기
| 변수 유형   | 선언 위치                         | 생성 시점                          | 소멸 시점                                                  |
|---------|-------------------------------|--------------------------------|--------------------------------------------------------|
| 지역      | 메서드 내부 또는 블록 내부                | 메서드 또는 블록 호출 시                 | 메서드 또는 블록이 종료될 때                                      |
| 멤버      | 클래스 내부, 메서드 밖                   | 객체가 생성될 때 (new 키워드 사용)       | 객체가 가비지 컬렉션에 의해 수거될 때 (더 이상 참조되지 않을 때)         |
| 클래스     | 클래스 내부, 메서드 밖에 `static` 키워드와 함께 | 클래스가 메모리에 로드될 때 (프로그램 시작 시) | 프로그램이 종료될 때 또는 해당 클래스가 더 이상 사용되지 않아 언로드될 때 |
---
<a id="5"></a>
## 5. 변수의 명명 규칙
변수의 이름을 정하는 것은 프로그래밍의 기본이자 매우 중요한 부분입니다. 이는 코드의 가독성과 유지 보수성에 영향을 미칩니다.
### 변수 이름 짓기의 기본 규칙
1. 변수 이름은 문자, 밑줄, 달러 기호로 시작해야 합니다.
2. 숫자는 먼저 시작하면 안되고 문자 뒤로 와야합니다.
3. 대소문자를 구분합니다. ex)`age`와 `Age`는 서로 다른 변수
4. 변수 이름에 공백을 포함할 수 없습니다.
5. 예약어를 변수 이름을 사용할 수 없습니다. ex)`int`, `class`,`static`등
### 자바에서 권장하는 변수 명명 규칙
1. 카멜케이스(CamelCase): 첫 단어를 제외한 각 단어의 첫 글자를 대문자로 시작합니다.`studentName` `totalScore`
2. 클래스 이름은 항상 대문자로 시작합니다. ex)`Student` `PersonInfo`
3. 상수 이름 대문자로 작성하며, 단어 사이는 밑줄로 구분 합니다. ex)`MAX_SIZE` `DEFAULT_VALUE`
---
<a id="6"></a>
## 6. 변수와 메모리
자바는 주로 두가지 영역의 메모리를 사용합니다. 그 영역은 스택(Stack)과 힙(Heap)입니다.
### 스택 (Stack) 과 힙 (Heap) 메모리
#### 스택
스택 메모리는 메소드 내에서 생성된 기본 데이터 타입의 변수와 객체 참조 변수들이 저장되는 곳입니다.
메소드가 호출되면 메소드를 위한 스택 프레임이 생성되고, 메소드가 종료되면 해당 스택 프레임이 제거되며 사용했던 변수들고 사라집니다.
이는 스택 메모리가 후입선출(LIFO, Last In First Out)방식으로 작동 합니다.
#### 힙
힙 메모리는 객체와 배열이 저장되는 곳입니다.이 영역은 전역적이며, 새로운 객체가 생성될 때마다 해당 객체를 위한 메모리가 할당됩니다. 가비지 컬렉터는 더이상 사용되지 않는 객체를
 감지하여 힙 메모리에서 제거합니다. 힙 메모리는 스택 메모리와 달리 생명주기가 길고 프로그램 전체에서 공유됩니다.

---
<a id="7"></a>
## 7. 변수의 타입 변환
자바에서는 데이터 타입 간 변환을 할 수 있습니다. 변환은 자동 타입 변환(Automatic Type Conversion)과 명시적 타입 변환(Casting)으로 나뉩니다.
잘못된 타입 변환은 데이터 손실이나 오류를 발생시킬 수 있습니다.
### 자동 타입 변환
자동 타입 변환은 프로그램 실행 시 자바 컴파일러에 의해 자동으로 수행되는 타입 변환입니다. 보통 크기가 작은 데이터 타입에서 크기가 큰 타입으로 변환 될 때 발생합니다.
이과정에서 데이터 손실이 발생하지 않습니다.
```java
int intVal = 100;
long longVal = intVal; // int에서 long으로 자동 타입 변환
float floatVal = longVal; // long에서 float으로 자동 타입 변환

System.out.println("Int value: " + intVal); // 100
System.out.println("Long value: " + longVal);// 100
System.out.println("Float value: " + floatVal);// 100.0

```
### 명식적 타입 변환
명시적 타입 변환은 개발자가 직접 데이터 타입을 변환해야 할 때 사용 합니다. 크기가 큰 데이터 타입을 작은 타입으로 변환하거나 
호환 되지 않는 타입간 변환을 할 때 명시적으로 타입을 지정해야 합니다. 이 과정에서 데이터 손실이 발생할 수 있습니다.
```java
double doubleVal = 3.14;
int intVal = (int) doubleVal; // double에서 int로 명시적 타입 변환 (캐스팅)

System.out.println("Double value: " + doubleVal); //3.14
System.out.println("Converted int value: " + intVal); //3 소수점 이하 데이터 손실
```
### 타입 변환 주의할 점
1. 데이터 손실: 명시적 타입 변환에서는 데이터 타입의 크기 차이로 인핸 데이터 손실이 발생할 수 있습니다. double에서 int로 타입 변환시 소수점이하 데이터는 손실됩니다.
2. 정밀도 손실: 큰 정밀고를 가진 데이터 타입을 작은 정밀도 데이터 타입을 변환할 때 정밀도 손실 발생합니다.
3. 오버플루우 및 언더플로우: 정수 타입 간의 변환에서 큰 값을 작은 타입으로 변환하려고 할 때 오버플로우 또는 언더플로우가 발생할 수 있습니다.
4. 호환되지 않는 타입: 일부 데이터 타입은 서로 호환 되지 않아 직접적인 변환이 불가합니다. boolean 타입은 다른 타입으로 변환할 수 없습니다.

# 참고
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html  
https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.4  
https://docs.oracle.com/javase/specs/jls/se10/html/jls-5.html