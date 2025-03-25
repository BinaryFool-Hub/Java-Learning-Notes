// 不管调用 toString() 函数还是直接输出对象都会调用 toString() 函数
// 被重写了方法的代码，想要输出对象的信息 toString() 函数是会被默认调用的
// 如果不重写方法调用输出的就是对象地址

import pkg.Fun;
import pkg.Fun1;

public class Main {
    public static void main(String[] args) {
        Fun fun = new Fun();
        Fun1 fun1 = new Fun1();


        // 重写后
        System.out.println(fun.toString());
        System.out.println(fun);

        // 没重写
        System.out.println(fun1.toString());
        System.out.println(fun1);
    }
}
