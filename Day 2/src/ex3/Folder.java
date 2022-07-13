package ex3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Entity {

    private String name;
    private List<Entity> entities = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Entity entity) {
        entities.add(entity);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am "+name+" abd these are my files:");
        for (Entity e : entities) {
            e.whoAmI();
        }
    }
}
