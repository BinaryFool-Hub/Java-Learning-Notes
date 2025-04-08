package pkg;

public class Class_1 {

    // 定义了一个返回值为 str 的函数，并且传入的参数为字符串（可以是其他类型）
    public String return_str(String value) {
        return value;
    }

    // 定义了一个返回值为 int 的函数，并且传入的参数为整形（可以是其他类型）
    public int return_int(int value) {
        return value;
    }

    // 定义了一个返回值为 void 的函数，即无返回值，并且传入的参数为字符串（可以是其他类型）
    public void return_void(String value) {
        System.out.println("传入的参数为：" + value);
        System.out.println("这是一个无返回值的函数");
    }

    // 同名函数，该函数可以传入整形参数
    public void return_void(int value) {
        System.out.println("同名函数，该函数可以传入值" + value);
    }
}
