package Lesson4;

public class HomeWorkApp4 {
    package Lesson4;

import java.util.Random;
import java.util.Scanner;

    public class HomeWorkApp4 {
        public static char[][] field;
        public static int fieldWidth;
        public static int fieldHeight;
        public static char empty = '_';

        public static char Player = 'X';
        public static char Computer = 'O';

        public static Scanner Scanner = new Scanner(System.in);
        public static Random Random = new Random();

        public static void main(String[] args) {
            Create_Fields();
            Show_Fields();
            while (true) {
                Playerstep();
                Show_Fields();
                if (checkWinLine(Player)) {
                    System.out.println(Player + "победитель!!");
                    break;
                }
                System.out.println("Игра окончена");
                if (checkFullField()) {
                    System.out.println("Ничья");
                    break;
                }
                System.out.println("Игра окончена");
            }
        }

        public static void Create_Fields() {
            fieldWidth = inputUserValue("Введите размер поля");
            fieldHeight = fieldWidth;
            field = new char[fieldWidth][fieldHeight];
            for (int i = 0; i < fieldWidth; i++) {
                for (int j = 0; j < fieldHeight; j++) {
                    field[i][j] = empty;
                }
            }
        }

        public static void Show_Fields() {
            for (int i = 0; i < fieldWidth; i++) {
                for (int j = 0; j < fieldHeight; j++) {
                    System.out.println(field[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println("-----------------");
        }

        public static void Playerstep() {
            int x;
            int y;
            do {
                x = inputUserValue("Введите свои координаты по горизонтали") - 1;
                y = inputUserValue("Введите свои координаты по вертикали") - 1;
            }
            while (!checkStepPlayer(x, y) || !checkCellFree(x, y));
            field[x][y] = Player;
        }

        public static void Computerstep() {
            int x;
            int y;
            do {
                x = Random.nextInt(fieldWidth);
                y = Random.nextInt(fieldHeight);
            } while (!checkCellFree(x, y));

            field[x][y] = Computer;

        }

        public static boolean checkCellFree(int x, int y) {
            return field[x][y] == empty;
        }

        public static boolean checkStepPlayer(int x, int y) {
            return x >= 0 && x < fieldWidth && y >= 0 && y < fieldHeight;
        }

        public static int inputUserValue(String systemMsg) {
            System.out.print(systemMsg + " > ");
            return Scanner.nextInt();
        }


        //честно стащила из вашего кода:
        public static boolean checkWinLine(char playerChar) {
            if (field[0][0] == playerChar && field[0][1] == playerChar && field[0][2] == playerChar) return true;
            if (field[1][0] == playerChar && field[1][1] == playerChar && field[1][2] == playerChar) return true;
            if (field[2][0] == playerChar && field[2][1] == playerChar && field[2][2] == playerChar) return true;

            if (field[0][0] == playerChar && field[1][0] == playerChar && field[2][0] == playerChar) return true;
            if (field[0][1] == playerChar && field[1][1] == playerChar && field[2][1] == playerChar) return true;
            if (field[0][2] == playerChar && field[1][2] == playerChar && field[2][2] == playerChar) return true;

            if (field[0][0] == playerChar && field[1][1] == playerChar && field[2][2] == playerChar) return true;
            if (field[0][2] == playerChar && field[1][1] == playerChar && field[2][0] == playerChar) return true;

            return false;
        }

        public static boolean checkFullField() {
            for (int y = 0; y < fieldHeight; y++) {
                for (int x = 0; x < fieldWidth; x++) {
                    if (field[y][x] == empty) {
                        return false;
                    }
                }
            }
            return true;
        }
    }


}
