public class Main {
    public static void main(String[] args) {

        // 使用 String 关键字来进行创建字符串
        String data = "Ab"; // 推荐
        String data1 = new String("这是字符串的定义");

        // 输出字符串
        System.out.println(data);
        System.out.println(data1);

        // 返回布偶值，是否和字符串相同，不是则 false
        System.out.println(data.equals("a"));  // 不会忽略大小写
        System.out.println(data.equalsIgnoreCase("a"));  // 会忽略大小写进行比较

        // 字符串的长度读取，一个字符就一个长度
        int len_result = data.length();
        System.out.println(len_result);

        // 获取单个字符的 ASCII 值
        int char_len = data.charAt(1);
        System.out.println(char_len);  // 取第二个字符的 ASCII 值，从 0 左边开始

        // 字符串进行比较大小
        int result = "aaa".compareTo("bbb"); // 会进行大小写比较
        System.out.println(result);
        int result1 = "BbBb".compareToIgnoreCase("AaAa"); // 忽略大小写比较
        System.out.println(result1);

        // 字符串的大小写转换
        String result_lower = data.toLowerCase();  // 全部都转换为小写
        System.out.println(result_lower);
        String result_upper = data.toUpperCase();  // 全部都转换为大写
        System.out.println(result_upper);

        // 字符串拼接
        String str = "你";
        String concat_result = str.concat("好");  // 也可以使用 + 号进行拼接
        System.out.println(concat_result);

        // 寻找字符串中字符的索引，字符串中某个内容的索引位置，返回-1表示查找不到
        String data11 = "你好，我是，java程序";
        int result11 = data11.indexOf("，");  // 返回第一次寻找到的位置
        System.out.println(result11);
        int result22 = data11.lastIndexOf("，");  // 返回最后一个寻找到的位置
        System.out.println(result22);

        // 自定义位置截取字符串的内容
        String data111 = "你好，我是，java程序";
        String result111 = data111.substring(3);  // 返回的是从下标开始以一直到最后的所有内容
        System.out.println(result111);
        String result222 = data111.substring(6, 10);  // 返回的是左闭右开区间的值
        System.out.println(result222);

    }
}
