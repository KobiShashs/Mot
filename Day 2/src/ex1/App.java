package ex1;

/**
 * Created by kobis on 13 Jul, 2022
 */
public class App {

    public static void main(String[] args) {
        System.out.println(new SimpleLine());
        System.out.println(new ExtendedLine(new SimpleLine()));
        System.out.println(new ExtendedLine(new ExtendedLine(new SimpleLine())));
        System.out.println(new ExtendedLine(new ExtendedLine(new SimpleLine())));
        System.out.println(new EdgeLine(new ExtendedLine(new ExtendedLine(new EdgeLine(new SimpleLine())))));

        System.out.println(new ExtendedLine(new EdgeLine(new SparklingLine(new SimpleLine()))));

    }
}
