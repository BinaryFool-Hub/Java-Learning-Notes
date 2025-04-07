public class append追加数据 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("这里面的是可操作数据");
        str.append(",追加的数据");  // 使用 append 方法来追加数据
        System.out.println(str);
    }
}
