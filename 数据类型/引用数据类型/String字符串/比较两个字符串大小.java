/**
 * - 里面参数都传递被比较的字符串
 * - 共同属性
 * ----- 第一个相等就比较第二个，以此类推
 * ----- 返回的两个 ASCII 相差多少
 * ----- 如果都相同则返回0
 * ----- 返回负数表示被比较的对象更大
 * ----- 返回正数表示比较的对象更大
 * - 不同属性
 * ----- compareToIgnoreCase 不会进行大小写比较（忽略大小写）
 * ----- compareTo 会进行大小比较
 */

public class 比较两个字符串大小 {
    public static void main(String[] args) {
        // 会进行大小写比较
        int result = "aaa".compareTo("bbb");
        System.out.println(result);

        // 忽略大小写比较
        int result1 = "BbBb".compareToIgnoreCase("AaAa");
        System.out.println(result1);
    }
}
