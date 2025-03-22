public class Main {
    public static void main(String[] args) {
        // double 类型可以存放 int 类型数据，不会丢失精度，但反之则不能
        double data2 = 2;
        System.out.println(data2);

        // 整形 * 双精度 用双精度接收会自动转换为精度更高的，不会丢失精度
        double data = 2.2;
        int data1 = 1;
        double result = data1 * data;
        System.out.println(result);

        // 手动转换数据类型
        double data3 = 3.3;
        int result1 = (int) data3; // 强制转换为整形，会直接切除小数部分
        System.out.println(result1);

    }
}
