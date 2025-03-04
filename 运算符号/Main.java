public class Main {
    public static void main(String[] args) {
        int a = 1, b;

        // 先增加
        b = ++a; // 先则运算，先计算a+1,然后在进行其他，如：赋值
        System.out.println(b);

        // 后增加
        b = a++;  // 按理应该等于3，但是因为这是后者运算，先进行其他，如：赋值，再进行a+1
        System.out.println(b);
    }
}
