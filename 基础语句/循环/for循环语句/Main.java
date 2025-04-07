public class Main {
    public static void main(String[] args) {
        /*
            for 语句里面的三个参数：
            第一个是初始化参数，可以多个语句
            第二个是条件参数，只能有一个布偶值
            第三个是运行完成一次循环需要做的参数，可以多个语句
        */

        // 一个单位语句
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        // 多个单位语句
        for (int i = 0, j = 0; i < 6; i++, j--) {
            System.out.println(i);
            System.out.println(j);
        }

    }
}
