import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {
        int[] list = {1, 5, 6, 7, 2, 3, 4};
        // list 进行排序，默认升序排序，没有降序的排序
        Arrays.sort(list);
        System.out.printf("排序后的数据：%s", Arrays.toString(list));
    }
}
