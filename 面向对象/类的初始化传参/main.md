# 类的初始化

**这是被调用的类**

```java
package pkg;

public class ClassInitParam {
    private final String value;

    // 无参构造函数
    public ClassInitParam() {
        this.value = "默认值";  // 默认值
    }

    // 带参数的构造函数
    public ClassInitParam(String value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }
}
```

- `final`: 常量，声明这个变量只能在初始化的时候改变
- `public ClassInitParam()`: 初始化调用函数，声明两次表示可以传入参数初始化也可以不传入参数

## 初始化不传入参数

```java
import pkg.ClassInitParam;

public class Main {
    public static void main(String[] args) {
        ClassInitParam classInitParam = new ClassInitParam();

        classInitParam.printValue();
    }
}
```

## 初始化传入参数

```java
import pkg.ClassInitParam;

public class Main {
    public static void main(String[] args) {
        ClassInitParam classInitParam = new ClassInitParam("这是参数值");

        classInitParam.printValue();
    }
}
```