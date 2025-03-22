import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 类型
        Scanner scanner = new Scanner(System.in);

        // 获取这个类的类型
        Class<?> type = scanner.getClass();
        // 获取这个类型名字
        System.out.println("Type of : " + type.getName());

        // 关闭scanner对象
        scanner.close();
    }
}