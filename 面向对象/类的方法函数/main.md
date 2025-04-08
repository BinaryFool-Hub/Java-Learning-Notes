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

# 自定义同名函数传入不同的参数

Java中的同名函数（也称为方法重载，Method Overloading）是指在同一个类中可以定义多个名称相同但参数列表不同的方法。     
这是Java实现多态性的一种方式。

如果不想传入参数也可以写一个无参数传递的函数      
同名函数可以写多个，但是需要看具体用处

- 作用：
    - 提高代码可读性：为相似功能的方法使用相同的名称
    - 简化API设计：使用者只需记住一个方法名，根据参数不同调用不同版本
    - 提供灵活性：允许方法以不同的方式被调用

- 被调用类

```java
package pkg;

public class Class_1 {
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

```

- 主要调用类

```java
import pkg.Class_1;

public class Main {
    public static void main(String[] args) {
        // 实例化对象
        Class_1 class1 = new Class_1();

        // 调用实例化对象的方法
        class1.return_void("无返回值的函数");

        // 同名函数，该函数可以传入整形参数
        class1.return_void(111);
    }
}
```