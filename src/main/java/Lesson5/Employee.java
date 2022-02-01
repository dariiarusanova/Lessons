package Lesson5;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    String salary;
    String age;

    public Employee(String name, String position, String email, String phone, String salary, String age) {
       name = name;
        position = position;
         email = email;
        phone = phone;
         salary = salary;
         age = age;
    }
    public int getAge(String age) {
        return age;
    }
    public void printInfo(){
        System.out.println("name " + name + " | position " + position + " | email " + email + " | phone number " + phone + " | salary " + salary +" | age "+age);
    }


}
