package db;

import example.Human;

public abstract class  Entity {
    public int id;

    public abstract Entity copy();

}
