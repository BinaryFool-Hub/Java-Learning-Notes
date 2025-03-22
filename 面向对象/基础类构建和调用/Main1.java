import pkg.PkgInfo;

public class Main1 {
    public static void main(String[] args) {
        // new 一个对象
        PkgInfo pkgInfo = new PkgInfo();

        // 调用里面的公共函数
        pkgInfo.return_hello();

        // 修改里面的公共属性信息
        pkgInfo.hello_word = "hello Java";
        // pkgInfo.not_callable = "hello Java"; // 不可被公共调用，因为不是公共属性

        // 再次调用里面的公共函数，里面的属性被更改，再次调用也会随之更改
        pkgInfo.return_hello();

        // 输出公共属性的值
        System.out.println(pkgInfo.hello_word);
    }
}
