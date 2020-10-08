package characters;

import java.util.ArrayList;

abstract class Character{
    private String name;
    private Temperament temperament;
    private int age;

    Character(String name, Temperament temperament, int age){
        this.age = age;
        this.name = name;
        this.temperament = temperament;
    }

    Character(){
        this.name = createName();
        this.age = createAge();
        this.temperament = createTemperament();
    }

    String createName(){
        ArrayList listNames = new ArrayList();
        listNames.add("Миша");
        listNames.add("Валера");
        listNames.add("Руслан");
        return  (String) listNames.get((int)(Math.random()*3));
    }
    int createAge(){
        final int young = 18;
        final int old = 30;
        return (int)((Math.random()*(old-young)+young));
    }
    Temperament createTemperament(){
        return Temperament.MELANHOLIC;
    }
    String getName(){
        return name;
    }
    Temperament getTemperament(){
        return temperament;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
        this.name = name;
    }
    void setTemperament(Temperament temperament){
        this.temperament = temperament;
    }
    void setAge(int age){
        this.age = age;
    }

}
