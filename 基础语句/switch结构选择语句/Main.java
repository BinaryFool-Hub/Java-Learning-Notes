public class Main {
    public static void main(String[] args) {
        // 和 if 语句类似，遇到满足的条件才会执行，但是有局限性，明确值的时候才能使用
        // 遇到满足的条件，但是不加break会继续执行下面的case代码直到完成/到有break语句 才能结束
        // 对于字符串的条件，需要根据版本来决定（17版本可以）

        int a = 3;

        switch (a) {
            case 1:
            case 2:
                // 满足 条件1 或者条件 2 都会执行
                System.out.println("语句二");
                break;
            case 3:
                System.out.println("语句三");
                break;
            case 4:
                System.out.println("语句四");
                break;
            default:
                // 该语句不强制放在后面，可以是前面（需要加入break）
        }
    }
}
