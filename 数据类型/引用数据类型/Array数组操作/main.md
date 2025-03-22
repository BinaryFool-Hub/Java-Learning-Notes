# 数组介绍

数组，类似于 python 的列表   
在 java 中数组需要是相同类型   
数组是利用下标（0开始）来取值和赋值  
没赋值的下标是它类型的默认值，int 默认 0、String 默认 null

# 定义数组

## 方式一，定义空间，不给值(推荐)

**这些方法都可以定义数组，只是数组的标识不固定在变量还是类型中**

```java
// 方法一，给类型标识是数组，推荐
int[] list = new int[5];  // 定义了5个空间的数组
```

```java
// 方法二，给变量标识是数组
int list[] = new int[5];
```

## 方式二，在定义数组的时候就给值

**不要固定空间大小，因为会自动适配**

```java
// 方法一，使用对象的方式
int[] list = new int[]{0, 1, 1, 1, 1};
```

```java
// 方法二，使用直接赋值的方式
int[] list = {1, 1, 1, 2, 2, 2};
```

# 数组空间赋值

## 初始化给值

- 在定义数组中方式二

## for 循环动态赋值

```java
import java.util.Random;

public static void main(String[] args) {
    Random random = new Random();  // 随机数的对象

    int[] list = new int[5];  // 定义了5个空间的数组

    // 读取 list 的长度，并且下标从 0 开始
    for (int i = 0; i < list.length; i++) {
        list[i] = random.nextInt(30, 90);
    }
}
```

## 静态赋值

```java
public static void main(String[] args) {
    int[] list = new int[5];  // 定义了5个空间的数组
    list[0] = 1;
    list[1] = 999;
}
```

# 数组空间的值读取

## 基础 for 循环读取数据

```java
public static void main(String[] args) {
    // list 数组必须是已经定义了的
    for (int i = 0; i < list.length; i++) {
        System.out.println(list[i]);
    }
}
```

## 增强for循环（for-each循环）

```java
public static void main(String[] args) {
    // list 数组必须是已经定义的
    // int j：int 是数组的类型，如果是其他的也需要跟随改变，j 是遍历后的数据值

    // int 类型数组
    for (int j : list) {
        System.out.println(j);
    }

    // 字符串类型数组
    for (String j : list) {
        System.out.println(j);
    }
}
```

# 数组的排序

排序默认是升序，字符串或字符都是针对 ASCII 值排序

```java
import java.util.Arrays; // 数组的操作库

public static void main(String[] args) {
    // 定义需要排序的数组
    int[] data = {1, 6, 9, 3, 4, 6, 7};

    // 默认升序排序，没有降序的排序
    Arrays.sort(data);

    // 取值输出
    for (int j : data) {
        System.out.print(j + "\t");
    }
}
```

# 数组转换为字符串

```java
import java.util.Arrays;

public static void main(String[] args) {
    int[] list = {1, 23, 34, 45, 5, 5};
    // 使用 Arrays.toString() 方法可以把数据抓换为字符串输出
    String string = Arrays.toString(list);
    System.out.println(string);
}
```

# 数组的复制

赋值运算赋值的是数组地址，是共存关系，相当于 window 的快捷方式     
把源数组的值复制到新的数组中，并且自定义新数组的长度，这两个数组需要是同类型

```java
import java.util.Arrays;

public class Array_copyof {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};

        // 赋值运算赋值的是数组地址，是共存关系，相当于window的快捷方式
        int[] data1 = data;
        data1[0] = 9;
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data1));

        // 使用数组的复制，复制的是值，是单独的了，没有共存关系
        int[] data2 = Arrays.copyOf(data, data.length);  // 第一个参数是需要复制的对象，第二个参数是这个新数组的总体长度
        data2[0] = 111;
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data2));

    }
}
```

# 多维数组

多维数组就是数组里面的数组，需要执行操作需要一层一层进去

```java
import java.util.Random;
import java.util.Arrays;

public class Array_in_Array {
    public static void main(String[] args) {
        Random random = new Random();

        // 二维数组：数组里面的数组，数组里面的数组长度不固定
        int[][] data = new int[3][3];

        // 自定义里面新的空间大小
        data = Arrays.copyOf(data, data.length + 1); // 新增了一个空间，但是没有设置里面层级的大小
        data[data.length - 1] = new int[6];  // 设置新的里面空间大小为 6

        // 二维数组赋值，先进去第一层再执行操作
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(1, 9);
            }
        }

        // 二维数组取值，先进去第一层再执行操作
        for (int[] item_array : data) {
            for (int item : item_array) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }
}
```