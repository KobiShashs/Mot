package ex1;

/**
 * Created by kobis on 13 Jul, 2022
 */
public class EdgeLine implements Line {

    private Line line;

    public EdgeLine(Line line) {
        this.line = line;
    }

    @Override
    public String draw() {
        return "|" + line.draw() + "|";
    }

    @Override
    public String toString() {
        return draw();
    }
}
