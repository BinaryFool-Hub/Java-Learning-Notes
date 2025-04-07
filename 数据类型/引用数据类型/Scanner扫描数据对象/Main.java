/**
 * Scanner 扫描对象，遇到空格表示分割，只能获取前面的数据，如果使用`scanner.nextLine();`表示获取一行字符串，这样就不会遇到空格就结束了
 * 可以获取系统的输入数据并且抓换为对应的类型
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 扫描类型
        // 构建系统输入对象，获取系统输入
        Scanner scanner = new Scanner(System.in);

        /* 获取系统输入的内容抓换为对应的类型 */
        System.out.print("输入双精度：");
        double data = scanner.nextDouble();
        System.out.println(data);
        System.out.print("输入整形：");
        int data1 = scanner.nextInt();
        System.out.println(data1);

        // 关闭扫描对象
        scanner.close();
    }
}
