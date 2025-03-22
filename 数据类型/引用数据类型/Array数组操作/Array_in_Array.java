import java.util.Random;
import java.util.Arrays;

public class Array_in_Array {
    public static void main(String[] args) {
        Random random = new Random();

        // 二维数组：数组里面的数组，数组里面的数组长度不固定
        int[][] data = new int[3][3];

        // 自定义里面新的空间大小
        data = Arrays.copyOf(data, data.length + 1); // 新增了一个空间，但是没有设置里面层级的大小
        data[data.length - 1] = new int[6];  // 设置新的里面空间大小为 6

        // 二维数组赋值，先进去第一层再执行操作
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(1, 9);
            }
        }

        // 二维数组取值，先进去第一层再执行操作
        for (int[] item_array : data) {
            for (int item : item_array) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }
}
