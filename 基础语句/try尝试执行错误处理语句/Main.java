import java.lang.ArithmeticException;  // 导入错误的板块，在错误信息里面可以查询到

public class Main {
    public static void main(String[] args) {
        // 尝试执行
        try {
            // 很明显这个错误是除数不能为0
            int a = 2 / 0;
        }
        // 如果这个错误被 ArithmeticException 捕获到就会返回给 e，可以输出 e 看具体问题
        catch (ArithmeticException e) {
            System.out.println("错误信息：" + e);
        }
        // 不管失败和成功执行都会执行这里面的代码块
        finally {
            System.out.println("执行完成");
        }
    }
}
