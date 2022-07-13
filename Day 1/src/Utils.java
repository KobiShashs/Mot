import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobis on 06 Jul, 2022
 */
public class Utils {

    public static List<Person> init(int len,Person p) throws CloneNotSupportedException {
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            list.add(p.clone());
        }
        return list;
    }
}
