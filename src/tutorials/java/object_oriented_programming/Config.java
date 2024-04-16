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
