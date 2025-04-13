import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 定义list，里面声明写的是存放的数据类型
        List<String> strings = new ArrayList<>();

        // 添加数据
        strings.add("添加数据");

        // 输出
        System.out.println("这是列表" + strings);
    }
}
