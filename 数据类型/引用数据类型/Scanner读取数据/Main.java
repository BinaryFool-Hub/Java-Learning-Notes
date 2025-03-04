import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 扫描类型
        // 构建系统输入对象，获取系统输入
        Scanner input_obj = new Scanner(System.in);

        // 获取系统输入的内容抓换为对应的类型
        System.out.print("输入双精度：");
        double data = input_obj.nextDouble();
        System.out.print("输入整形：");
        int data1 = input_obj.nextInt();

        System.out.println(data);
        System.out.println(data1);
    }
}
