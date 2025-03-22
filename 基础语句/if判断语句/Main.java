public class Main {
    public static void main(String[] args) {
        // 非空即 true
        if (1 == 1) {
            System.out.println("相等");
        } else if (1 < 1) {
            System.out.println("小与");
        } else {
            System.out.println("不相等");
        }

        // 判断字符串是否相同使用 equals
        String data = "字符串";
        if (data.equals("字符串")) {
            System.out.println("相同");
        }
    }
}
