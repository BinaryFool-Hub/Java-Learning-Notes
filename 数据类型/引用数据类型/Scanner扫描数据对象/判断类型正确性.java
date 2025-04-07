/**
 * 判断输入的数据是否得到预期
 */

import java.util.Scanner;

public class 判断类型正确性 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("输入整形（可以是其他类型）：");
        if (scanner.hasNextInt()) {
            // 如果是整形则执行这段语句，是存入判断空间再执行该代码块
            int result = scanner.nextInt();
            System.out.println("输入合法：" + result);
        } else {
            System.out.println("输入不合法");
        }

        // 关闭扫描对象
        scanner.close();
    }
}
