public class Main {
    public static void main(String[] args) {
        int i = 0;  // 条件计数器

        while (i <= 100) {  // 条件,满足这会执行

            System.out.println("执行的语句块");

            i += 1;  // 避免死循环，计数器 + 1
        }
    }
}
