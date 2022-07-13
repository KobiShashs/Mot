package ex1;

/**
 * Created by kobis on 13 Jul, 2022
 */
public class ExtendedLine implements Line{

    private Line line;

      public ExtendedLine(Line line) {
        this.line = line;
    }

    @Override
    public String draw() {
        return line.draw() + line.draw();
    }

    @Override
    public String toString() {
        return draw();
    }
}
