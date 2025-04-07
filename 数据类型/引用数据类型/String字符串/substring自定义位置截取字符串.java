/**
 * 字符的位置下标从0开始
 */
public class substring自定义位置截取字符串 {
    public static void main(String[] args) {
        String data111 = "你好，我是，java程序";
        String result111 = data111.substring(3);  // 返回的是从下标开始以一直到最后的所有内容
        System.out.println(result111);
        String result222 = data111.substring(6, 10);  // 返回的是左闭右开区间的值
        System.out.println(result222);
    }
}
