package example;

import db.Database;
import db.exception.EntityNotFoundException;

public class Main {
    public static void main(String[] args) {
        Human ali = new Human("Ali");
        Database.add(ali);

        ali.name = "Ali Hosseini";

        try {
            Human aliFromTheDatabase = (Human) Database.get(ali.id);
            System.out.println("ali's name in the database: " + aliFromTheDatabase.name);
            // خروجی باید "Ali" باشد نه "Ali Hosseini"
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
        }
    }
}