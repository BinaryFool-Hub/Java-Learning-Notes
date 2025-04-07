# 使用int/double来举例，其他的都是类似

| 特性  | 基本类型(int/double)       | 包装类 (Integer/Double) |
|-----|------------------------|----------------------|
| 类型  | 基本数据类型                 | 对象类型                 |
| 存储  | 直接存储值                  | 存储对象的引用              |
| 默认值 | 0 (int) / 0.0 (double) | null                 |
| 用途  | 高效计算                   | 需要对象的场景              |

# 转换对应的数据类型(int举例)，其他的都是类似

## 字符串抓换整形

使用parseInt()方法来进行转换为整形

```java
public class Main {
    public static void main(String[] args) {
        // 字符串转换为整形
        String data = "1";
        int info = Integer.parseInt(data);  // 使用parseInt方法来进行转换
        System.out.println(info);
    }
}
```

## 整形转换字符串

使用toString()方法来把整形转换为字符串

```java
public class 整形转换为字符串 {
    public static void main(String[] args) {
        // 整形转换为字符串
        int a = 111;
        String b = Integer.toString(a);  // 使用toString()方法来把整形转换为字符串
        System.out.println(b);
    }
}
```