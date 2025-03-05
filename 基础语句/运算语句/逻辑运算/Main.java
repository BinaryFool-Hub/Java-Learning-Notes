public class Main {
    public static void main(String[] args) {
        //    ! > 算数运算 > 比较运算 > && > ||
        // + - / * : 基础运算符

        // ! 取反，返回布偶值
        boolean info = true;
        boolean result = !info;
        System.out.println(result);

        // < >: 比较运算，返回布偶值
        boolean result1 = 1 < 2;
        System.out.println(result1);

        // && ：返回布偶值，是否相同，and运算
        boolean result2 = 1 == 1 && 0 == 2;  //  明显只能满足一个条件，返回false
        System.out.println(result2);

        // || ：返回布偶值，是否两个条件满足一个，or运算
        boolean result3 = 1 == 2 || 1 == 1;  // 只满足一个条件就行
        System.out.println(result3);
    }
}

