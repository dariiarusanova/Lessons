package Lesson3;

public class HomeWorkApp3 {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        ChangeNumbers();
        Change();
        System.out.println("*******************");
        System.out.println("Задание №2");
        Massive100();
        System.out.println("*******************");
        System.out.println("Задание №3");
        Massive_one_by_one();
        System.out.println("*******************");
        System.out.println("Задание №4");
        DubbleMassive();


    }

    // Задание1
    public static void ChangeNumbers() {
        int[] numbers = {0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Длина массива: " + numbers.length);
    }

    public static void Change() {
        int[] numbers = {0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
            System.out.println(numbers[i]);

        }
    }

    // Задание 2
    public static void Massive100() {
        int[] empty = new int[100];
        for (int i = 0; i < empty.length; i++) {
            i = i++;
            System.out.println(i);
        }
        System.out.println("Длина массива: " + empty.length);
    }

    // Задание 3
    public static void Massive_one_by_one() {
        int[] line = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; line[i] < line.length; i++) {
            line[i] *= 2;
            System.out.println(line[i]);
        }
    }

    //Задание 4
    public static void DubbleMassive() {
        int side = 3;
        int[][] cross = new int[side][side];
        for (int i = 0; i < side; i++) {
            cross[i][i] = 1; //????
            System.out.println("Дальше не хватило сил");
        }
    }
}








