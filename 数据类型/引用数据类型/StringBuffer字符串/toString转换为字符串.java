public class toString转换为字符串 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("这里面的是可操作数据");
        String convert = str.toString();

        Class<?> type = convert.getClass();  // 展示数据类型
        System.out.println(type);
        System.out.println(convert);
    }
}
