package pkg;

public class PkgInfo {
    public String hello_word = "Hello word !";

    // 不可被公共调用
    String not_callable = "属性不可被公共调用,单纯输出";

    public void return_hello() {
        System.out.println(hello_word);
        System.out.println(not_callable);
    }
}
