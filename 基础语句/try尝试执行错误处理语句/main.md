# try的作用

try：可以让你的代码尝试执行，如果执行错误就走相对应的代码块    
catch：尝试执行失败，可以处理你已经知道的错误类型     
finally：不管成功与失败都会执行

# 基本语句

## 方式一

大多数的代码块报错拦截都可以使用这种方式

```java
import java.util.InputMismatchException;  // 输入错误
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 尝试执行
        try {
            System.out.print("输入：");
            int data = scanner.nextInt();
            System.out.println("你输入的是" + data);
        }
        // 如果这个错误被 InputMismatchException 捕获到就会返回给 e，可以输出 e 看具体问题
        catch (InputMismatchException e) {
            System.out.println("你输入的是非 int 类型的数据，程序结束");
        }
        // 不管失败和成功执行都会执行这里面的代码块
        finally {
            scanner.close();
        }
    }
}
```

## 方式二

这个方式推荐需要关闭对象的时候使用

```java
import java.util.InputMismatchException;  // 输入错误
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // 尝试执行，会在try块结束时自动关闭，无需手动调用close()方法。
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("输入：");
            int data = scanner.nextInt();
            System.out.println("你输入的是" + data);
        }
        // 如果这个错误被 InputMismatchException 捕获到就会返回给 e，可以输出 e 看具体问题
        catch (InputMismatchException e) {
            System.out.println("你输入的是非 int 类型的数据，程序结束");
        }
        // 不管失败和成功执行都会执行这里面的代码块
        finally {
            System.out.println("111");
        }
    }
}

```