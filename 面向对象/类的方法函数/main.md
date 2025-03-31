# 参数传递

参数的传递不仅仅可以传入我们常见的数据类型，还可以传入自定义的类的数类型（类）    
实际传入的自定义数据类型不仅可以是自身的实例化类，还可以是其他的    
和 python 的 class 传 class类似

- 主要调用方法

```java
import pkg.Class_2;

public class CustomIncomingType {

    public static void main(String[] args) {
        Class_2 class2 = new Class_2();

        // class2 是实例化后传入的对象
        class2.fun(class2);
    }
}
```

- 被传入对象的类

```java
package pkg;

public class Class_2 {
    public int value = 999;

    // Class_2 是形参数据类型
    public void fun(Class_2 fun) {
        System.out.println(fun.value);
    }
}
```