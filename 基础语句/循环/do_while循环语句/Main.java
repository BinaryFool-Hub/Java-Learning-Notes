public class Main {
    public static void main(String[] args) {
        int count = 0;

        do {
            System.out.println("先执行再判断条件");
        } while (count != 0);  // 执行完成一次后判断条件，为 false 就不会执行了
    }
}
