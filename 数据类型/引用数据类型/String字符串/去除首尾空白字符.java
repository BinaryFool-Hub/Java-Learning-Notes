/**
 * strip() 方法可以正确的去除Unicode编码，但是trim()可能不行
 */

public class 去除首尾空白字符 {
    public static void main(String[] args) {
        String str = "  \u2000你好\u3000  "; // 包含全角空格和 Unicode 空白字符
        System.out.println(str.trim().length());   // 可能无法完全去除
        System.out.println(str.strip().length());   // 能正确去除所有空白
    }
}
