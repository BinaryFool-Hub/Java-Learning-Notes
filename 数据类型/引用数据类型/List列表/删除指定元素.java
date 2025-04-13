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
