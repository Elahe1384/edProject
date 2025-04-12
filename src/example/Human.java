package example;
import db.Entity;


import db.Entity;

public class Human extends Entity {
    public static final int HUMAN_ENTITY_CODE = 14;
    public String name;
    public int age;

    public Human(String name) {
        this(name, 0);
    }

    public Human(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public Human copy() {
        Human copyHuman = new Human(name, age);
        copyHuman.id = id;
        return copyHuman;
    }

    @Override
    public int getEntityCode() {
        return HUMAN_ENTITY_CODE;
    }

