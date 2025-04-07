/**
 * 转换为字符串数据类型
 * 基本数据类型转换为引用数据类型在`数据类型/引用数据类型/包装类`提到过
 */
public class Main {
    public static void main(String[] args) {
        int a = 1;

        // 使用包装类
        String a_str = Integer.toString(a);
        System.out.println(a_str);

        // 使用简便的手法
        String b = a + "";
        System.out.println(b);
    }
}
