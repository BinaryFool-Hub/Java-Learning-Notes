import java.util.Date;
import java.text.SimpleDateFormat; // 简单日期格式化

public class Main {
    public static void main(String[] args) {
        Date date = new Date();  // 当前系统日期，默认输出的是英文日期
        System.out.println(date);

        // 使用简单格式化输出可观的数据
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd:ss");  // 格式化对象
        String data = simpleDateFormat.format(date);  // 进行格式化
        System.out.println(data);
    }
}
