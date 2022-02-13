package parent;
/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.*/
public class Animals {

    protected String name;
    private float maxrun;
    private float maxswim;
    public static int countAnimals = 0;
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    public static int Swim_none = -1;

    public Animals(String name, float maxrun, float maxswim) {
        this.name = name;
        this.maxrun = maxrun;
        this.maxswim = maxswim;
        ++countAnimals;
    }

    String getName(){ return this.name; }
    float getRun(){ return this.maxrun; }
    float getSwim(){ return this.maxswim; }
    protected String name (){return this.name;}
    public boolean run(float distance) {
        return (distance <= maxrun);
    }

    public int swim(float distance) {
        return (distance <= maxswim) ? SWIM_OK : SWIM_FAIL;
    }

}
