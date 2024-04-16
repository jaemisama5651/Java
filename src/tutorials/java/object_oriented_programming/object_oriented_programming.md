# 객체 지향 프로그래밍
[목차](../../tutotials.md)  
## 1. 클래스와 객체
객체 지향 프로그래밍(Object-Oriented Programming, OOP)은
프로그램을 객체들의 집합으로 모델링하여 프로그램의 구조를 이해하고 개발 하는 방법론입니다. 중심이 되는것은 클래스와 객체 입니다.
### 클래스의 정의와 구조
클래스는 객체를 생성하기 위한 템플릿 또는 설계도 역할을 합니다. 클래스는 객체의 상태를 나타내는 필드변수와 객체의 행동을 정의하는 메소드로 구성됩니다.
```java
public class Car {
    // 필드(상태)
    String color;
    int year;
    
    // 생성자
    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }
    
    // 메소드(행동)
    public void drive() {
        System.out.println("차가 달립니다!");
    }
    
    public void brake() {
        System.out.println("차가 멈춥니다!");
    }
}
```
이 예제에서 Car 클래스는 두 개의 필드(color, year)와 두 개의 메소드(drive(), brake())를 가지고 있습니다. 또한, Car 객체를 생성할 때 사용되는 생성자도 정의되어 있습니다.
### 객체의 생성과 사용
객체는 클래스의 인스턴스입니다. 클래스로부터 객체를 생성하기 위해 new 키워드를 사용하여
클래스의 생성자를 호출합니다.
```java
public class Main {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car("빨강", 2021);
        
        // 객체의 메소드 사용
        myCar.drive();
        myCar.brake();
    }
}
```
이 예제에서는 Car 클래스의 인스턴스인 myCar 객체를 생성하고 있습니다. 객체를 생성할 때는 new 키워드와 함께 클래스의 생성자를 호출하며, 이때 생성자에 정의된 매개변수에 해당하는 값을 전달합니다. 객체가 생성되면, 해당 객체의 메소드(drive(), brake())를 호출하여 사용할 수 있습니다.
## 2. 메소드
객체 지향 프로그래밍에서 메소드는 클래스의 일부로 정의된 프로그래밍 절차로
 해당 클래스에서 인스턴스화 된 모든 객체가 사용할 수 있습니다.
### 메소드의 정의와 호출
메소드는 클래스 내에 정의된 함수로서 특정 작업을 수행하는 코드 블록입니다. 
메소드는 입력(매개변수), 처리, 출력(반환값)의 구조로 이루어집니다.
#### 메소드 정의 방법
```java
접근제어자 반환타입 메소드명(매개변수 리스트){
        //처리 로직
        return 반환값;
    }
```
- 접근제어자: 메소드 접근을 제어하는 키워드 `public` `private`
- 반환타입: 메소드가 처리후 반환하는 데이터의 타입 반환값이 없을 경우 `void`
- 메소드명: 메소드를 호출하기 위한 이름
- 매개변수 리스트: 메소드에 전달되는 인자의 목록
#### 메소드 호출 방법
`객체명.메소드명(인자값)`
#### 메소드의 예제
```java
public class Calculator {
    // 메소드 정의: 두 수의 합을 반환하는 메소드
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // 메소드 정의: 두 수의 차를 반환하는 메소드
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Calculator 객체 생성
        
        // 메소드 호출
        int sum = calc.add(10, 5); // 15
        int diff = calc.subtract(10, 5); // 5
        
        System.out.println("합: " + sum);
        System.out.println("차: " + diff);
    }
}
```
이 예제에서 Calculator 클래스 내에 add 메소드와 subtract 메소드를 정의하고, main 메소드에서 이를 호출하여 사용합니다. add 메소드와 subtract 메소드는 두 개의 int 타입 매개변수를 받아 처리한 후, 결과값을 int 타입으로 반환합니다.
### 매개변수와 반환값
#### 매개변수(Parameter)
메소드가 작업을 수행하기 위해 필요한 입력 데이트 메소드가 호출될 때 인자(Argument)의 형태로 전달됩니다.
```java
public class Greeting {

    // 사용자의 이름을 매개변수로 받아 인사말을 출력하는 메소드
    public void sayHello(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting(); // Greeting 객체 생성
        
        greeting.sayHello("김철수"); // "김철수"를 매개변수로 메소드 호출
    }
}

```
#### 반환값(Return Value)
메소드가 작업을 마치고 그 결과를 호출한 곳에 돌려주는 값. 모든 메소드가 반환값을 
가지는 것은 아니며, 반환값이 없는 경우 반환 타입으로 void를 사용합니다.
```java
public class Calculator {

    // 두 정수의 합을 계산하여 반환하는 메소드
    public int add(int num1, int num2) {
        return num1 + num2; // 계산 결과를 반환
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Calculator 객체 생성
        
        int result = calc.add(5, 7); // add 메소드 호출 및 결과값 저장
        System.out.println("두 수의 합: " + result); // 결과값 출력
    }
}

```
## 3. 생성자
생성자는 클래스의 인스턴스, 객체가 생성될 때 자동을로 호출되는 
특별한 메서드입니다. 객체의 초기화를 담당하여 객체가 사용되기 전에 필요한 상태를 설정합니다.
### 생성자의 정의와 특징
- 생성자의 이름은 해당 클래스의 이름과 이름과 동일해야 합니다.
- 생성자의 값을 반환하지 않으며 반환 타입을 지정하지 않습니다.
- new 키워드를 사용하여 객체를 생성할 때 해당 클래스의 생성자가 자동으로 호출 됩니다.
- 클래스에는 매개변수의 수나 타입이 다른 여러 생성자를 정의할 수 있습니다. 이를 생성자 오버로딩이라고 합니다.
- 생성자는 상속되지 않습니다. 상속받은 클래스는 부모 클래스의 생성자를 직접 호출할 수 없으며 자식 클래스는 자신의 생성자를 갖습니다.
### 생성자의 사용
생성자는 주로 객체의 필드를 초기화하는 데 사용됩니다. 객체가 정상적으로 작동하기 위해 필요한 초기 설정을 제공 하는 역할입니다.
```java
class Student {
    String name;
    int age;

    // 기본 생성자
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // 매개변수가 있는 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 학생 정보 출력 메서드
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // 기본 생성자를 사용하여 객체 생성
        Student student1 = new Student();

        // 매개변수가 있는 생성자를 사용하여 객체 생성
        Student student2 = new Student("John", 20);

        // 학생 정보 출력
        student1.displayInfo(); // 출력: Name: Unknown, Age: 0
        student2.displayInfo(); // 출력: Name: John, Age: 20
    }
}

```
## 4. this
객체 지향에서는 this 키워드는 현재 객체의 참조를 나타냅니다. 다양한 this 사용법을 알아 보겠습니다.
### 현재 객체의 필드와 메소드 접근
클래스 내부에서 this 키워드를 사용하면 현재 객체의 필듸와 메소드에 명시적으로 접근할 수 있습니다.
```java
class Student {
    String name;

    void setName(String name) {
        this.name = name; // 매개변수로 받은 name을 현재 객체의 name 필드에 할당
    }

    void printName() {
        System.out.println(this.name); // 현재 객체의 name 필드 출력
    }
}

```
### 생성자 오버로딩 this()
this()를 사용하여 같은 클래스내의 다른 생성자를 호출 합니다. 코듸 중복을 줄이고, 각 생성자의 초기화 코드를 한 곳에 집중 시킬 수 있는 방법입니다.
```java
class Rectangle {
    int width;
    int height;

    Rectangle() {
        this(0, 0); // 다른 생성자 호출
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
```
### 메소드 체이닝의 this
메소드 체이닝은 메소드 호출을 연쇄적으로 이어가는 프로그래밍 패턴입니다. 메소드에서 this를 반환함으로써 메소드 체이닝을 구현합니다.
```java
public class StringBuilderExample {
    private StringBuilder stringBuilder;

    public StringBuilderExample() {
        this.stringBuilder = new StringBuilder();
    }

    public StringBuilderExample append(String text) {
        stringBuilder.append(text);
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        example.append("Hello, ").append("world!").append(" Welcome to method chaining.");

        System.out.println(example.toString());
        // 출력: Hello, world! Welcome to method chaining.
    }
}
```
### 현재 인스턴스 반환하기
메소드 내에서 this를 반환하면 현재 객체의 참조를 반환할 수 있습니다. 이는 현재 객체를 다른 메소드에 전달하거나, 현재 객체의 참조를 필요로 하는 다양한 상황에서 유용합니다.
```java
public class Config {
    private boolean optionA = false;
    private boolean optionB = false;

    // 옵션 A 설정
    public Config setOptionA(boolean value) {
        this.optionA = value;
        return this; // 현재 인스턴스 반환
    }

    // 옵션 B 설정
    public Config setOptionB(boolean value) {
        this.optionB = value;
        return this; // 현재 인스턴스 반환
    }

    public void printOptions() {
        System.out.println("Option A: " + optionA + ", Option B: " + optionB);
    }

    public static void main(String[] args) {
        Config config = new Config();
        config.setOptionA(true); // 현재 인스턴스 반환을 활용하지만 체이닝은 사용하지 않음
        config.setOptionB(true);
        config.printOptions();
    }
}
```