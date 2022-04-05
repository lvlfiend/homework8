package task_2;

class Test_2 extends Point_2 {
    static double x = 4.7;
    public static void main(String[] args) {

        new Test_2().printX();
    }
    void printX() {
        System.out.println(x);
        System.out.println(Point_2.x);

    }
}

