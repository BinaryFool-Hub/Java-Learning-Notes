# 介绍

Scanner 类是 Java 中一个非常有用的工具类，位于 java.util 包中，主要用于解析原始类型和字符串的简单文本扫描器。     
Scanner 扫描对象，遇到空格表示分割，只能获取前面的数据，如果使用`scanner.nextLine();`表示获取一行字符串，这样就不会遇到空格就结束了

# 构建扫描对象

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 关闭扫描对象
        scanner.close();
    }
}
```

# 获取扫描数据

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 获取系统输入的内容抓换为对应的类型 */
        System.out.print("输入双精度：");
        double data = scanner.nextDouble();
        System.out.println(data);
        System.out.println("输入字符串：");
        String str_data = scanner.next();
        System.out.println(str_data);

        // 关闭扫描对象
        scanner.close();
    }
}
```

# 判断获取的数据类型是否正确

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 判断输入的数据是否得到预期 */
        System.out.println("输入整形（可以是其他类型）：");
        if (scanner.hasNextInt()) {
            // 如果是整形则执行这段语句，是存入判断空间再执行该代码块
            int result = scanner.nextInt();
            System.out.println("输入合法：" + result);
        } else {
            System.out.println("输入不合法");
        }

        scanner.close();
    }
}
```