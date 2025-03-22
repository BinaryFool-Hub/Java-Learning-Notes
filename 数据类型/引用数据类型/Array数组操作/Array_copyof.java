import java.util.Arrays;

public class Array_copyof {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};

        // 赋值运算赋值的是数组地址，是共存关系，相当于window的快捷方式
        int[] data1 = data;
        data1[0] = 9;
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data1));

        // 使用数组的复制，复制的是值，是单独的了，没有共存关系
        int[] data2 = Arrays.copyOf(data, data.length);  // 第一个参数是需要复制的对象，第二个参数是这个新数组的总体长度可以自定义
        data2[0] = 111;
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data2));

    }
}
