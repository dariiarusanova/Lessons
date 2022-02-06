package Lesson5;

public class Employee {
    //пересдача дз
    static void printInfo(){
        System.out.println("name " + Employee.name + " | position " + Employee.position + " | email " + Employee.email + " | phone number " + Employee.phone + " | salary " + Employee.salary +" | age " +Employee.age);
    }
    static String name;
    static String position;
    static String email;
    static String phone;
    static String salary;
    static String age;


    public Employee(String name, String position, String email, String phone, String salary, String age) {
       name = name;
        position = position;
         email = email;
        phone = phone;
         salary = salary;
         age = age;
    }
    public String getAge() {
        return age;
    }
  }
