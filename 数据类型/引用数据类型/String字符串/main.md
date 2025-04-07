# 创建字符串

使用`String`关键字来创建字符串

```java
public class Main {
    public static void main(String[] args) {

        // 使用 String 关键字来进行创建字符串
        String data = "这是字符串的定义"; // 推荐
        String data1 = new String("这是字符串的定义");

        // 输出字符串
        System.out.println(data);
        System.out.println(data1);
    }
}
```

# 字符串值比较是否相等

## equals()方法

使用字符串的方法`equals()`来获取值是否相等，不会忽略大小写

里面参数传入你需要判断的字符串

```java
public class Main {
    public static void main(String[] args) {

        // 使用 String 关键字来进行创建字符串
        String data = "A";

        // 返回布尔值，是否和字符串相同，不是则 false
        System.out.println(data.equals("a"));
    }
}
```

## equalsIgnoreCase()方法

使用字符串的方法`equalsIgnoreCase()`来获取值是否相等，会忽略大小写

里面参数传入你需要判断的字符串

```java
public class Main {
    public static void main(String[] args) {

        // 使用 String 关键字来进行创建字符串
        String data = "A";

        // 返回布尔值，是否和字符串相同，不是则 false
        System.out.println(data.equalsIgnoreCase("a"));
    }
}
```

# 字符串的长度读取

使用字符串的方法`length()`来获取字符串的长度

直接调用方法，没有参数传递，但是有返回值

```java
public class Main {
    public static void main(String[] args) {

        // 使用 String 关键字来进行创建字符串
        String data = "这是字符串的定义"; // 推荐

        // 字符串的长度读取，一个字符就一个长度
        int len_result = data.length();
        System.out.println(len_result);
    }
}
```

# 字符串字符的 ASCII 值获取

使用字符串的方法`charAt()`来获取字符的 ASCII 值

里面参数传递在字符串的第几个，从0开始，返回 ASCII 值

```java
public class Main {
    public static void main(String[] args) {

        String data = "Aaaa";

        // 参数 0 表示第一个，可以自定义
        int result = data.charAt(0);
        System.out.println(result);
    }
}
```

# 比较两个字符串大小

- 里面参数都传递被比较的字符串
- 共同属性
    - 第一个相等就比较第二个，以此类推
    - 返回的两个 ASCII 相差多少
    - 如果都相同则返回0
    - 返回负数表示被比较的对象更大
    - 返回正数表示比较的对象更大
- 不同属性
    - compareToIgnoreCase 不会进行大小写比较（忽略大小写）
    - compareTo 会进行大小比较

## compareTo()方法

compareTo 会进行大小比较

```java
public class Main1 {
    public static void main(String[] args) {

        // 会进行大小写比较
        int result = "aaa".compareTo("bbb");
        System.out.println(result);
    }
}
```

## compareToIgnoreCase()方法

compareToIgnoreCase 不会进行大小写比较（忽略大小写）

```java
public class Main1 {
    public static void main(String[] args) {

        // 忽略大小写比较
        int result1 = "BbBb".compareToIgnoreCase("AaAa");
        System.out.println(result1);
    }
}
```

# 大小写转换

## toLowerCase()方法

全部都转换为小写的字符

```java
public class Test {
    public static void main(String[] args) {
        String data = "ABVc";
        String result = data.toLowerCase();
        System.out.println(result);
    }
}
```

## toUpperCase()方法

全部都转换为大写的字符

```java
public class Test {
    public static void main(String[] args) {
        String data = "abcG";
        String result = data.toUpperCase();
        System.out.println(result);
    }
}
```

# 拼接字符串

除了可以使用 + 号拼接还可以使用方法函数 concat()

```java
public class Test {
    public static void main(String[] args) {
        String a = "你";
        String b = "好";
        String c = a.concat(b);
        System.out.println(c);
    }
}
```

# 寻找字符串中字符的索引

字符串中某个内容的索引位置，返回-1表示查找不到

## indexOf() 方法

返回第一次寻找到的位置

```java
public class Test {
    public static void main(String[] args) {
        String data = "你好，我是，java程序";

        int result = data.indexOf("，");  // 返回第一次寻找到的位置
        System.out.println(result);
    }
}
```

## lastIndexOf() 方法

返回最后一个寻找到的位置

```java
public class Test {
    public static void main(String[] args) {
        String data = "你好，我是，java程序";

        int result = data.lastIndexOf("，");  // 返回最后一个寻找到的位置
        System.out.println(result);
    }
}
```

# 自定义位置截取字符串的内容

字符的位置下标从0开始

## substring() 方法一个参数

返回的是从下标开始以一直到最后的所有内容

```java
public class Test {
    public static void main(String[] args) {
        String data = "你好，我是，java程序";

        String result = data.substring(3);
        System.out.println(result);
    }
}
```

## substring() 方法两个参数

返回的是左闭右开区间的值

```java
public class Test {
    public static void main(String[] args) {
        String data = "你好，我是，java程序";

        String result = data.substring(6, 10);
        System.out.println(result);
    }
}
```

# 去除首位空字符

strip() 方法可以正确的去除Unicode编码，但是trim()可能不行

## strip()方法(推荐)

能正确去除所有空白

```java
public class Test {
    public static void main(String[] args) {
        String str = "  \u2000你好\u3000  "; // 包含全角空格和 Unicode 空白字符
        System.out.println(str.strip().length());   // 能正确去除所有空白
    }
}
```

## trim()方法

可能无法完全去除

```java
public class Test {
    public static void main(String[] args) {
        String str = "  \u2000你好\u3000  "; // 包含全角空格和 Unicode 空白字符
        System.out.println(str.trim().length());   // 可能无法完全去除
    }
}
```

# 使用特定字符来分裂字符串

使用split()方法来分裂字符串，返回数组，和python一样        
里面第一个值传入分裂的索引，第二个值是进行几次分裂

```java
public class Test {
    public static void main(String[] args) {
        String split_data = "你好，你是谁，你是Java，你好，我是谁，我是Java";

        // 第一个值是分裂的索引，第二个值是进行几次分裂
        String[] split_over = split_data.split("，", 2);
        System.out.println(split_over.length);

        for (String value : split_over) {
            System.out.println(value);
        }
    }
}
```