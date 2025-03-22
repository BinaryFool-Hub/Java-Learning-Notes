public class Main {
    public static void main(String[] args) {
        String data = "这是连接的字符";
        int info = 1;

        // 输出换行，使用 + 进行拼接
        System.out.println("输出换行" + data + info);

        // 输出不换行，使用 + 进行拼接
        System.out.print("输出不换行" + data + info);

        // 格式化输出
        System.out.printf("这是格式化输出 %s %d", data, info);
    }
}
