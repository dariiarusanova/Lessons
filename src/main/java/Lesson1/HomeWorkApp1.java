package Lesson1;

public class HomeWorkApp1 {
        public static void main(String[] args) {
        PrintThreeWords();
        CheckSumSign();
        PrintColor();
        CompareNumbers();


    }

        public static void PrintThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

        public static void  CheckSumSign() {
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

        public static void PrintColor() {
        int value = 1234;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

        public static void CompareNumbers() {
        int aa = 48;
        int bb = 10;
        if (aa >= bb) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    }

