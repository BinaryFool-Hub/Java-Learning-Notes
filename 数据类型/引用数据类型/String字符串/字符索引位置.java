/**
 * 字符串中某个内容的索引位置，返回-1表示查找不到
 */
public class 字符索引位置 {
    public static void main(String[] args) {
        String data = "你好，我是，java程序";

        int result = data.indexOf("，");  // 返回第一次寻找到的位置
        System.out.println(result);

        int result1 = data.lastIndexOf("，");  // 返回最后一个寻找到的位置
        System.out.println(result1);
    }
}
