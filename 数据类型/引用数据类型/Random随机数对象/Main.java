import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();  // 随机数对象

        // 据说 17 版本前只能传递一个参数
        int random_number = random.nextInt(1, 9);  // 可以不限制范围，左闭右开区间
        System.out.println(random_number);
    }
}
