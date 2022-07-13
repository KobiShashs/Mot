/**
 * Created by kobis on 06 Jul, 2022
 */
public class Person {

    private int id;
    private String name;
    private String city;
    private double age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public static Person build() {
        return new Person();
    }

    public Person id(int id) {
        setId(id);
        return this;
    }

    public Person name(String name) {
        setName(name);
        return this;
    }

    public Person city(String city) {
        setCity(city);
        return this;
    }

    public Person age(double age) {
        setAge(age);
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Person clone() {
        try {
            return build().name(this.name).city(this.city).age(this.age).id(this.id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
