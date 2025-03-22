// do while、while、for，这三个语句都可以使用关键字来退出和跳过
// break : 退出父级循环
// continue : 跳过当前的一次循环，不执行下面代码

public class Main {
    public static void main(String[] args) {
        // 以for语句为示例，其他循环都是一样的效果
        for (int i = 0; i < 9; i++) {

            // 等于3就跳过i为3的当前这次循环，不会执行continue下面的代码
            if (i == 3) {
                System.out.println("缺少" + i);
                continue;
            }

            // 等于7就退出父级的循环，不会再次执行这个循环体和下面的代码也不会等执行完成才退出
            if (i == 7) {
                break;
            }

            System.out.println(i);
        }
    }
}
