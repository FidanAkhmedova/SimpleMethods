public class HomeWorkApp {
    public static void main(String[] args) {
        compareNumbers();
        printColor();
        checkSumSign(7, 8);
        printThreeWords();
        printThreeWords();
        printThreeWords();
    }

    public static void printThreeWords() {
        //comment
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple\n");
    }

    public static void checkSumSign(int a, int b) {
        if(a + b > 0)
            System.out.println("Сумма положительная\n");
        else if (a + b < 0)
            System.out.println("Сумма отрицательная\n");
    }

    public static void printColor() {
        int value = 8;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int num1 = 12, num2 = 87;
        if (num1 >= num2)
            System.out.println("a >= b");
        else
            System.out.println("a < b");

    }

}
