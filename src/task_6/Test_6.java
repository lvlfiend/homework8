package task_6;

public class Test_6 extends T1 {
    public static void main(String[] args) {
        Test_6 t = new Test_6();
        System.out.println(((T2) t).print());
        System.out.println(((T1) t).print());
    }

    static String print() {
        return "Test";
    }
}

