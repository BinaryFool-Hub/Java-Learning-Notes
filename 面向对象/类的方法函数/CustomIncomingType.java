import pkg.Class_2;

public class CustomIncomingType {

    public static void main(String[] args) {
        Class_2 class2 = new Class_2();

        // class2 是实例化后传入的对象
        class2.fun(class2);
    }
}
