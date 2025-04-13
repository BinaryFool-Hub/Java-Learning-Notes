# list 和 array 的区别

## 大小灵活性

- 数组：固定长度，一旦创建就不能改变大小
- List：动态大小，可以根据需要自动增长或缩小

## 类型支持

- 数组：可以存储基本数据类型(如int, char等)和对象
- List：只能存储对象，不能存储基本数据类型(但可以使用包装类如Integer)

## 功能方法

- 数组：只有length属性和基本的访问操作
- List：提供了丰富的方法(add, remove, contains等)

## 内存分配

- 数组：在内存中是连续分配的
- List：基于链表或动态数组实现，不一定是连续的

## 性能

- 数组：随机访问更快(O(1))
- List：某些实现(如LinkedList)在中间插入/删除更快

# list 操作

## 定义list

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 定义list，里面声明写的是存放的数据类型
        List<String> strings = new ArrayList<>();
    }
}
```

## 添加和展示数据

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 定义list
        List<String> strings = new ArrayList<>();

        // 添加数据
        strings.add("添加数据");

        // 输出
        System.out.println(strings);
    }
}
```

## 删除元素

### 删除指定元素

- remove(): 传入值
- removeAll(): 传入集合，使用Collections.singleton()包装就行

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 删除指定元素 {
    public static void main(String[] args) {
        // 定义list
        List<String> strings = new ArrayList<>();

        // 删除里面指定元素
        strings.add("准备删除的数据");
        strings.add("准备删除的数据");
        strings.add("准备删除的数据");
        strings.add("准备删除的数据");

        strings.remove("准备删除的数据");  // 删除一条
        System.out.println("已经删除后的数据：" + strings);

        strings.removeAll(Collections.singleton("准备删除的数据"));  // 删除所有，需要包装才能为集合
        System.out.println("已经删除后的数据：" + strings);
    }
}
```

### 删除条件满足元素

- removeIf(): 里面传入的是指向条件

```java
import java.util.ArrayList;
import java.util.List;

public class 删除条件满足元素 {
    public static void main(String[] args) {
        // 定义list
        List<String> strings = new ArrayList<>();

        // 删除里面条件满足的数据
        strings.add("条件满足的数据");
        strings.add("条件满足的数据");
        strings.removeIf(str -> str.equals("条件满足的数据"));  // 删除所有条件满足的数据
        System.out.println(strings);
    }
}
```

## 转换为数组

- toArray(): 里面传入的是新的对象，空间为0就会自动分配, 例：toArray(new String\[0])

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 转换为数组 {
    public static void main(String[] args) {
        // 定义list
        List<String> strings = new ArrayList<>();

        strings.add("数据1");
        strings.add("数据2");
        strings.add("数据3");

        // 转换为数组
        String[] strings_array = strings.toArray(new String[0]);  // 会自动分配空间
        System.out.println("这是数组：" + Arrays.toString(strings_array));
    }
}
```

## 遍历循环取值

遍历循环取值，也可以和数组一样遍历

```java
import java.util.ArrayList;
import java.util.List;

public class 遍历循环取值 {
    public static void main(String[] args) {
        // 定义list
        List<String> strings = new ArrayList<>();

        // 遍历循环取值，也可以和数组一样遍历
        strings.add("准备的数据");
        strings.add("准备的数据");
        strings.add("准备的数据");
        strings.add("准备的数据");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
```