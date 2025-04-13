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
