package Lesson6;

import parent.Animals;

public class Dog extends Animals {
    public static int countDog = 0;
    public Dog(String name, float run, float swim) {
        super(name, run, swim);
        ++countDog;
    }
}
