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
