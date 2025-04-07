/**
 * 在日常编码中推荐使用方法一(Double b = a;)，它更简洁且完全等效。
 * 只有在需要特别强调装箱操作或处理旧代码时，才考虑显式使用 valueOf()。
 * 基本数据类型转换为引用数据类型在`数据类型/引用数据类型/包装类`提到过
 */
public class 引用数据类型接收基本数据类型装箱 {
    public static void main(String[] args) {
        double c = 111.11;
        Double d = c;  // 方法一(推荐)  自动装箱
        Double b1 = Double.valueOf(c);  // 方法二  显式装箱
        System.out.println(d);
        System.out.println(b1);
    }
}
