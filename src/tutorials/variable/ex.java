package tutorials.variable;

public class ex {
    public static void main(String[] args) {
        double doubleVal = 3.14;
        int intVal = (int) doubleVal; // double에서 int로 명시적 타입 변환 (캐스팅)

        System.out.println("Double value: " + doubleVal);
        System.out.println("Converted int value: " + intVal); // 소수점 이하 데이터 손실


    }
}
