package Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.printLn (checkNumbers(8,15));
        System.out.printLn (PlusNumber(5));
        System.out.printLn (PositiveNumber(7))? "Число позитивное" : "Число негативное";
        System.out.printLn (Printback("Hello",6));

    }
    public static boolean checkNumbers ( int a, int b){
        return (a + b >= 10) && (a + b <= 20);
    }


    public static void PlusNumber(int a) {
        if (a >= 0) {
            System.out.printLn(a + "положительное" );
        } else {
            System.out.printLn(a + "отрицательное" );
        }
    }

    public static boolean PositiveNumber (int d){
        return d <= 0;
    }

    public static void Printback (String value, int n) {
        for (int i = 1; i <= n; i++){
            System.out.print("String " + i + ":" + value);
        }
    }
}
