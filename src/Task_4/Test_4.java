package Task_4;

class Test extends Point_4 {
    double x = 4.7;
    void printBoth() {
        System.out.println(x + " " + super.x);
    }
    public static void main(String[] args) {
        Test sample = new Test();
        sample.printBoth();
        System.out.println(sample.x + " " + Point_4.x);
//напишите здесь ваш код
    }
}

