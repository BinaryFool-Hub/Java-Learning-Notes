/**
 * 会把每个字符都转换为对应的大小写
 */

public class 大小写转换 {
    public static void main(String[] args) {
        String data = "ABVc";

        String result = data.toLowerCase();  // 全转换为小写
        System.out.println(result);

        String result1 = data.toUpperCase();  // 全部转换为大写
        System.out.println(result1);
    }
}
