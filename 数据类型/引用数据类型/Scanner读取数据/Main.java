import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 扫描类型
        // 构建系统输入对象，获取系统输入
        Scanner input_obj = new Scanner(System.in);

        // 获取系统输入的内容抓换为对应的类型
        System.out.print("输入双精度：");
        double data = input_obj.nextDouble();
        System.out.println(data);
        System.out.print("输入整形：");
        int data1 = input_obj.nextInt();
        System.out.println(data1);

        // 判断输入的数据是否得到预期
        if (input_obj.hasNextInt()) {
            // 如果是整形则执行这段语句，是存入判断空间再执行该代码块
            System.out.println("输入整形：");
            int result = input_obj.nextInt();
            System.out.println("输入合法：" + result);
        }

        // 关闭扫描对象
        input_obj.close();
    }
}
