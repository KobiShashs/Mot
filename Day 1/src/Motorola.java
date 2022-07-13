import java.util.List;

/**
 * Created by kobis on 06 Jul, 2022
 */
public class Motorola {

    private static Motorola instance = null;
    private final String name = "MOTOROLA";
    private List<Person> people;

    private Motorola() {
        this.people = Utils.init(10, Person.build().name("Moshe").age(50));
    }

    public static Motorola getInstance() {
        if (instance == null) {
            synchronized (Motorola.class) {
                if (instance == null) {
                    instance = new Motorola();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public List<Person> getPeople() {
        return people;
    }


    public void display() {
        people.forEach(System.out::println);
    }

}
