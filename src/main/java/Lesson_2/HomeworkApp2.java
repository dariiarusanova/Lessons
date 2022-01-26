package Lesson_2;

public class HomeworkApp2 {
    public static void main(String... args){
        checkNumbers(8,15);
        System.out.println("**********");
        PlusNumber(5);
        System.out.println("**********");
        PositiveNumber(5);
        System.out.println("**********");
        Printback("Good evening",6);

    }
    public static boolean checkNumbers( int a, int b){
        return (a + b >= 10) && (a + b <= 20);
    }


    public static void PlusNumber(int a) {
        if (a >= 0) {
            System.out.print(a + "positive" );
        } else {
            System.out.print(a + "negative" );
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


