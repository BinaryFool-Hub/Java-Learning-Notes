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

使用字符串的方法`equals`来获取值是否相等

- 里面参数传入你需要判断的字符串

```java
public class Main {
    public static void main(String[] args) {

        // 使用 String 关键字来进行创建字符串
        String data = "这是字符串的定义"; // 推荐

        // 返回布尔值，是否和字符串相同，不是则 false
        System.out.println(data.equals("这是字符串的定义"));
    }
}
```

# 字符串的长度读取

使用字符串的方法`length`来获取字符串的长度

- 直接调用方法，没有参数传递，但是有返回值

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

使用字符串的方法`charAt`来获取字符串的 ASCII 值

- 里面参数传递在字符串的第几个，从0开始，返回 ASCII 值

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

使用字符串的方法`compareToIgnoreCase`或者`compareTo`来获取两个字符串的大小

- 里面参数都传递被比较的字符串
- 共同属性
    - 第一个相等就比较第二个，以此类推
    - 返回的两个 ASCII 相差多少
    - 如果都相同则返回0
    - 返回负数表示被比较的对象更大
    - 返回正数表示比较的对象更大
- 不同属性
    - compareToIgnoreCase 会进行大小比较
    - compareTo 不会进行大小写比较（忽略大小写）

```java
public class Main1 {
    public static void main(String[] args) {
        // 共同属性：第一个相等就比较第二个，以此类推，如果都相同则返回0
        //          返回负数则表示被比较的对象更大，反则更小

        // 会进行大小写比较
        int result = "aaa".compareTo("bbb");
        System.out.println(result);

        // 忽略大小写比较
        int result1 = "BbBb".compareToIgnoreCase("AaAa");
        System.out.println(result1);
    }
}
```