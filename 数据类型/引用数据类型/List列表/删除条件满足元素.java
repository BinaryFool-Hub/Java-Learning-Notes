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
