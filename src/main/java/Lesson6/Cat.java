package Lesson6;

import parent.Animals;

public class Cat extends Animals {
    public static int countCat = 0;
    public Cat(String name, float run, float swim) {
        super(name, run, swim);
        ++countCat;
    }
    public int swim(float distance) {
        return Animals.Swim_none;
    }
}
