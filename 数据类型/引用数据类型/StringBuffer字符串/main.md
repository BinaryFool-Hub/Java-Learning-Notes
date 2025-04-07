# String和StringBuffer对比和场景

- 对比
    - StringBuffer 提供了更多修改字符串的方法，如 append(), insert(), delete(), reverse() 等
    - String 的方法大多返回新字符串，不改变原字符串

- 场景的适用：
    - String：适用于字符串不常变化的场景
    - StringBuffer：适用于多线程环境下频繁修改字符串的场景

# 创建StringBuffer对象

该对象是需要适用new来创建的，里面存放的是字符串数据，但是整体数据类型是StringBuffer

```java
public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("这里面的是可操作数据");
        System.out.println(str);
    }
}
```

# 置后追加数据

使用append方法来进行置后数据追加

```java
public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("这里面的是可操作数据");
        str.append(",追加的数据");  // 使用 append 方法来追加数据
        System.out.println(str);
    }
}
```

# 插入数据

插入数据，而不是追加数据，不置于最后面追加，可以用户自定义追加的位置，但是插入的索引是从0下标开始

```java
public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("这里面的是可操作数据");
        str.insert(0, "插入的数据,");  // 使用insert来追加数据，第一个位置是追加开始的索引位置，第二个是数据值
        System.out.println(str);
    }
}
```

# 转换字符串

StringBuffer本身就不是字符串数类型，所以需要抓换为String数据类型
```java
public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("这里面的是可操作数据");
        String convert = str.toString();  // 转换数据类型为String
        System.out.println(convert);
    }
}
```