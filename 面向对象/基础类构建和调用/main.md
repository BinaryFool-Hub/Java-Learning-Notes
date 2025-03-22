# 基础知识

## 被调用的类在同级目录

如果一个被调用的类在同级的时候则不需要导入和公共信息的声明   
被调用的类可以使用里面的属性和函数
> 被调用类：Info.java
> 调用运行类：Main.java

```java
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
```

## 被调用的类`不`在同级目录

当类需要被调用的时候，在包里面的类如果想要被外面访问里面的东西则需要使用`public`来声明是公共的   
被调用的类可以使用里面的公共属性和公共函数
> 例如当前目录的：pkg/PkgInfo.java
> 如果需要被父级调用则需要导入

```java
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
```

