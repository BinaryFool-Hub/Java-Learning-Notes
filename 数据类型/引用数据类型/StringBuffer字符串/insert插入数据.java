public class insert插入数据 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("这里面的是可操作数据");
        str.insert(0, "插入的数据,");  // 使用insert来追加数据，第一个位置是追加开始的索引位置，第二个是数据值
        System.out.println(str);
    }
}
