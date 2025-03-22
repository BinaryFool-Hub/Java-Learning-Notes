public class Main {
    public static void main(String[] args) {

        // 使用 String 关键字来进行创建字符串
        String data = "这是字符串的定义"; // 推荐
        String data1 = new String("这是字符串的定义");

        // 输出字符串
        System.out.println(data);
        System.out.println(data1);

        // 返回布偶值，是否和字符串相同，不是则 false
        System.out.println(data.equals("这是字符串的定义"));

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
    }
}
