/**
 * 使用split()方法来分裂字符串，返回数组，和python一样
 */

public class split分裂字符串 {
    public static void main(String[] args) {
        String split_data = "你好，你是谁，你是Java，你好，我是谁，我是Java";

        // 第一个值是分裂的索引，第二个值是进行几次分裂
        String[] split_over = split_data.split("，", 2);
        System.out.println(split_over.length);

        for (String value : split_over) {
            System.out.println(value);
        }
    }
}