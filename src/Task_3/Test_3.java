package Task_3;

import task_2.Point_2;

class Test_3 extends Point_3 {
    static double x = 4.7;
    public static void main(String[] args) {
        new Test_3().printX();
    }
    void printX() {
        System.out.println(Point_3.x);
        System.out.println(Point_3.x);
    }
}

