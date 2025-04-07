/**
 * 使用字符串的方法`charAt()`来获取字符的 ASCII 值
 * 里面参数传递在字符串的第几个，从0开始，返回 ASCII 值
 */
public class 字符的ASCII值 {
    public static void main(String[] args) {
        String data = "Aaaa";

        // 参数 0 表示第一个，可以自定义
        int result = data.charAt(0);
        System.out.println(result);
    }
}
