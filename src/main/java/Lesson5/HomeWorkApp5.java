package Lesson5;

public class HomeWorkApp5 {

    public static void main(String[] args) {
        Employee[] Employee_Array = new Employee[5];
        Employee_Array[0] = new Employee("Boris", "Teacher", "te@ya.ru", "9160691033", "50.000", "50");
        Employee_Array[1] = new Employee("Venera", "Cooker", "cook@ya.ru", "9160691045", "100.000", "35");
        Employee_Array[2] = new Employee("Olga", "Doctor", "doc@ya.ru", "9880691485", "97.000", "47");
        Employee_Array[3] = new Employee("Maxim", "Driver", "dr@ya.ru", "9168451253", "110.000", "31");
        Employee_Array[4] = new Employee("Michael", "Writer", "wr@ya.ru", "9160646152", "150.000", "45");
        Go();
    }
    public static void Go(){
        for (int i = 0; i < 40; i++) {
            if (Employee[i].getAge() > 40) {
                Employee.printInfo();
            }
        }
    }

}


