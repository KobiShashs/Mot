/**
 * Created by kobis on 06 Jul, 2022
 */
public class Test {

    public static void main(String[] args) {

        Person p1 = Person.build().id(123).name("Moshe").city("TLV").age(35);
        Person p2 = Person.build().name("Moshe").city("TLV").age(35);
        Person p3 = Person.build().name("Moshe").city("TLV");


        Motorola.getInstance().display();
    }
}
