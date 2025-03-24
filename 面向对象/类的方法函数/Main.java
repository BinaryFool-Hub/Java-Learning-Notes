import pkg.Class_1;

public class Main {
    public static void main(String[] args) {
        // 实例化对象
        Class_1 class1 = new Class_1();

        // 调用实例化对象的方法并且接收返回值
        String result_str = class1.return_str("返回字符串的函数");
        System.out.println(result_str);

        // 调用实例化对象的方法并且接收返回值
        int result_int = class1.return_int(111);
        System.out.println(result_int);

        // 调用实例化对象的方法
        class1.return_void("无返回值的函数");
    }
}
