import java.util.Random;  // 随机数对象

public class Main {
    public static void main(String[] args) {
        // 随机数对象
        Random random = new Random();

        // 定义空间为 10 的数组
        int[] list = new int[10];

        // list.length 读取数组的长度，然后遍历
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(40, 110);
        }

        // 使用的是 for-each 来取值数组
        for (int j : list) {
            System.out.print(j + "\t");
        }
    }
}
