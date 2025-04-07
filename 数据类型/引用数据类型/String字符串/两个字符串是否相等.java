/**
 * 使用字符串的方法`equals()`来获取值是否相等，不会忽略大小写
 * 使用字符串的方法`equalsIgnoreCase()`来获取值是否相等，会忽略大小写
 */
public class 两个字符串是否相等 {
    public static void main(String[] args) {
        String data = "A";

        // 返回布尔值，是否和字符串相同，不是则 false
        System.out.println(data.equals("a"));

        // 忽略大小写
        System.out.println(data.equalsIgnoreCase("a"));
    }
}
