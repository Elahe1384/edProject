import db.Database;
import db.exception.EntityNotFoundException;
import example.Human;

ppublic class Main {
    public static void main(String[] args) throws InvalidEntityException {
        Database.registerValidator(Human.HUMAN_ENTITY_CODE, new HumanValidator());

        Human ali = new Human("Ali", -10);
        Database.add(ali);
    }
}}