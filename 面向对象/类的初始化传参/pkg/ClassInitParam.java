package pkg;

public class ClassInitParam {
    private final String value;

    // 无参构造函数
    public ClassInitParam() {
        this.value = "默认值";  // 默认值
    }

    // 带参数的构造函数
    public ClassInitParam(String value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }
}
