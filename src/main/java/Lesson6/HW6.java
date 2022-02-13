package Lesson6;

import parent.Animals;

public class HW6 {
    public static void main(String[] args) {
        Cat Cat1 = new Cat("'Molly'",200, 0);
        Dog Dog1 = new Dog("'Jack'",500,10);
        Animals[] Animals = {Cat1,Dog1};
        String eventResults;

        float runLength = 250;
        float swimLength = 8;
        for (int i = 0; i < Animals.length; i++) {
            String nameString = Animals[i].name() + " может пробежать" +  Animals[i].run(runLength);
            int swimResult = Animals[i].swim() + " может проплыть" +  Animals[i].swim(swimLength);

            if (swimResult == Cat.Swim_none)
                eventResults = " это не получилось, т.к. не умеет плавать";
        }

    }
}
