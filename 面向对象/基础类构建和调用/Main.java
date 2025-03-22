public class Main {
    public static void main(String[] args) {
        // new 一个对象
        Info info = new Info();

        // 调用里面的函数
        info.return_hello();

        // 修改里面的属性信息
        info.hello_word = "hello Java";

        // 再次调用里面的函数，里面的属性被更改，再次调用也会随之更改
        info.return_hello();

        // 输出属性的值
        System.out.println(info.hello_word);
    }
}
